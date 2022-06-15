package com.tp.yogioteur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "mainPage";
	}
	
	@GetMapping("/member/loginPage")
	public String loginPage() {
		return "member/login";
	}
	
	@GetMapping("/member/signInPage")
	public String signInPage() {
		return "member/signIn";
	}
	
	
	@PostMapping("/member/login")
	public void login() {
		
	}
	
}
