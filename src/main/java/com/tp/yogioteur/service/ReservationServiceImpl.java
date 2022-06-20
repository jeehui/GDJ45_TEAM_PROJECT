package com.tp.yogioteur.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.yogioteur.domain.ReservationDTO;
import com.tp.yogioteur.mapper.reservationMapper;
import com.tp.yogioteur.util.ReservationUtils;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private reservationMapper reservationMapper;
	
	@Override
	public void payments(HttpServletRequest request, HttpServletResponse response) {
		
		String no = ReservationUtils.reservataionCode(8).trim();
		Long memberNo = Long.parseLong(request.getParameter("memberNo"));
		Long roomNo = Long.parseLong(request.getParameter("roomNo"));
		Long nonNo = 1L;
		Long food = Long.parseLong(request.getParameter("food"));
		Long people = Long.parseLong(request.getParameter("people"));
		
		ReservationDTO reservation = ReservationDTO.builder()
				.reserNo("RN_" + no)
				.memberNo(memberNo)
				.roomNo(roomNo)
				.nonNo(nonNo)
				.reserFood(food)
				.reserPeople(people)
				.build();
		
		int res = reservationMapper.reservationInsert(reservation);
		// hit 형식
		
		// 응답
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			if(res == 1) {
				out.println("<script>");
				out.println("alert('결제 완료 되었습니다.')");
				out.println("location.href='" + request.getContextPath() + "/reservation/reservationConfirm'");
				out.println("</script>");
				out.close();
			} else {
				out.println("<script>");
				out.println("alert('결제가 실패했습니다.')");
				out.println("history.back()");
				out.println("</script>");
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
