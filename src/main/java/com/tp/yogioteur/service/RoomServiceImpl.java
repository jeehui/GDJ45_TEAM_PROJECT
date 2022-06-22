package com.tp.yogioteur.service;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.tp.yogioteur.domain.ImageDTO;
import com.tp.yogioteur.domain.RoomDTO;
import com.tp.yogioteur.mapper.RoomMapper;
import com.tp.yogioteur.util.MyFileUtils;

import net.coobird.thumbnailator.Thumbnails;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public void reservationRoom(HttpServletRequest request, Model model) {
		
	}
	@Override
	@Transactional
	public void saveRoom(MultipartHttpServletRequest request, HttpServletResponse response) {
		String roomName = request.getParameter("roomName");
		Integer roomPrice = Integer.parseInt(request.getParameter("roomPrice"));
		Long rtNo = Long.parseLong(request.getParameter("rtNo"));
		RoomDTO room = RoomDTO.builder()
				.roomName(roomName)
				.roomPrice(roomPrice)
				.roomStatus(0)
				.rtNo(rtNo)
				.roomCheckOut(Date.valueOf("9999-12-31"))
				.build();
		System.out.println(room);
		int res = roomMapper.insertRoom(room);
		System.out.println(room);
		
		// 첨부된 모든 파일들
		List<MultipartFile> files = request.getFiles("files");  // 파라미터 files
		
		// 파일 첨부 결과
		int fileAttachResult;
		if(files.get(0).getOriginalFilename().isEmpty()) {  // 첨부가 없으면 files.size() == 1임. [MultipartFile[field="files", filename=, contentType=application/octet-stream, size=0]] 값을 가짐.
			fileAttachResult = 1; 
		} else {  // 첨부가 있으면 "files.size() == 첨부파일갯수"이므로 fileAttachResult = 0으로 시작함.
			fileAttachResult = 0;
		}
		
		for (MultipartFile multipartFile : files) {
			try {
				// 첨부가 없을 수 있으므로 점검해야 함.
				if(multipartFile != null && multipartFile.isEmpty() == false) {  // 첨부가 있다.(둘 다 필요함)
					// 첨부파일의 본래 이름(origin)
					String origin = multipartFile.getOriginalFilename();
					origin = origin.substring(origin.lastIndexOf("\\") + 1);  // IE는 본래 이름에 전체 경로가 붙어서 파일명만 빼야 함
					
					// 첨부파일의 저장된 이름(saved)
					String saved = MyFileUtils.getUuidName(origin);
					
					// 첨부파일의 저장 경로(디렉터리)
					String path = MyFileUtils.getTodayPath();
					
					// 저장 경로 없으면 만들기
					File dir = new File(path);
					if(dir.exists() == false) {
						dir.mkdirs();
					}
					
					// 첨부파일
					File file = new File(dir, saved);
					
					// 첨부파일 확인
					String contentType = Files.probeContentType(file.toPath());  // 이미지의 Content-Type(image/jpeg, image/png, image/gif)
					if(contentType.startsWith("image")) {
						// 첨부파일 서버에 저장(업로드)
						multipartFile.transferTo(file);
						
						// 썸네일 서버에 저장(썸네일 정보는 DB에 저장되지 않음)
						Thumbnails.of(file)
							.size(96, 54)
							.toFile(new File(dir, "s_" + saved));
						
						// FileAttachDTO
						ImageDTO image = ImageDTO.builder()
								.imagePath(path)
								.imageOrigin(origin)
								.imageSaved(saved)
								.roomNo(room.getRoomNo())
								.build();
						System.out.println(image);
						// FileAttach INSERT 수행
						fileAttachResult += roomMapper.insertImage(image);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  // for
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			if(res == 1 && fileAttachResult == files.size()) {
				out.println("<script>");
				out.println("alert('객실이 등록되었습니다.')");
				out.println("location.href='" + request.getContextPath() + "/admin/room'");
				out.println("</script>");
				out.close();
			} else {
				out.println("<script>");
				out.println("alert('객실 등록에 실패했습니다.')");
				out.println("history.back()");
				out.println("</script>");
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Map<String, Object> findRooms() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("rooms", roomMapper.selectRoomList());
		
		return map;
	}
	
}
