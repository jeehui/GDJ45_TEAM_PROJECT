package com.tp.yogioteur.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.tp.yogioteur.domain.ReviewDTO;
import com.tp.yogioteur.mapper.ReviewMapper;
import com.tp.yogioteur.util.PageUtils;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewMapper reviewMapper;
	
	@Override
	public void ReviewSave(MultipartHttpServletRequest request, Model model) {
		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
		
		int totalRecord = reviewMapper.selectReviewCount();
		PageUtils pageUtils = new PageUtils();
		pageUtils.setPageEntity(totalRecord, page);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("beginRecord", pageUtils.getBeginRecord());
		map.put("endRecord", pageUtils.getEndRecord());
		
		List<ReviewDTO> reviews = reviewMapper.selectReviewList(map);
		
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("reviews", reviews);
		model.addAttribute("beginNo", totalRecord - (page -1 ));
		model.addAttribute("totalRecord", totalRecord);
		
		
		
	
	}
	
	@Override
	public void removeReview(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
}
