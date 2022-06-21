package com.tp.yogioteur.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tp.yogioteur.service.RoomService;

@Controller
public class MainController {
	
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/")
	public String index() {
		return "mainPage";
	}
	
<<<<<<< HEAD
//	@PostMapping("/room/roomList")
//	public String list(HttpServletRequest request, Model model) {
//		roomService.reservationRoom(request, model);
//		return "room/roomList";
//	}
=======
	@PostMapping("/room/roomList")
	public String list(HttpServletRequest request, Model model) {
		roomService.reservationRoom(request, model);
		return "room/roomList";
	}
	
>>>>>>> jee
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
