package com.tp.yogioteur.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface ReviewService {

	// 리뷰 삽입
	public void ReviewSave(MultipartHttpServletRequest multipartRequest, Model model);
	
	// 리뷰 삭제
	public void removeReview(HttpServletRequest request, HttpServletResponse response);
	
	
}
