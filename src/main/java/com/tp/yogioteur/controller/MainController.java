package com.tp.yogioteur.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
<<<<<<< HEAD
	 @PostMapping("/room/roomList") public String list(HttpServletRequest request,
	  Model model) { roomService.reservationRoom(request, model); 
	   return "room/roomList"; 
	  }
	 
=======
	@GetMapping("/admin/index")
	public String adminPage() {
		return "admin/index";
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
	
<<<<<<< HEAD
=======
>>>>>>> jieun
=======
		//form 정보 전달
		@PostMapping("/room/roomList")
		public void list(HttpServletRequest request, Model model) {
			roomService.roomList(request, model); 
		}
		
		@PostMapping("/room/saveRoom")
		public void saveRoom(MultipartHttpServletRequest request, HttpServletResponse response) {
			roomService.saveRoom(request, response);
		}
		
		@ResponseBody
		@GetMapping(value = "/room/findRooms", produces = "application/json")
		public Map<String, Object> findRooms() {
			return roomService.findRooms();
		}
	
>>>>>>> jee
}
