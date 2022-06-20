package com.tp.yogioteur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {

	@GetMapping("/review/reviewList")
	public String reviewList() {
		return "review/reviewList";
	}
	
	@GetMapping("/review/reviewSavePage")
	public String reviewSavePage() {
		return"review/reviewSave";
	}
}
