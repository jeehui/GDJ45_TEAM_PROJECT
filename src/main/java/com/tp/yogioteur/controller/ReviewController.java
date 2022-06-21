package com.tp.yogioteur.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.tp.yogioteur.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	public ReviewService reviewService;
	
	@GetMapping("/review/reviewList")
	public String reviewList() {
		return "review/reviewList";
	}
	
	@GetMapping("/review/reviewSavePage")
	public String reviewSavePage() {
		return"review/reviewSave";
	}
	
	@PostMapping("/review/reviewSave")
	public void reviewSave(MultipartHttpServletRequest multiparRequest, Model model) {
		//reviewService.ReviewSave(multiparRequest, model);
	}
	
	@GetMapping("/review/removeReview")
	public void removeReview(HttpServletRequest request, HttpServletResponse response) {
		//reviewService.removeReview(request, response);
	}
	
}
