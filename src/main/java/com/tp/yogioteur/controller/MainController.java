package com.tp.yogioteur.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
=======

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
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744

@Controller
public class MainController {
	
<<<<<<< HEAD
=======
	@Autowired
	private RoomService roomService;
	
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
	@GetMapping("/")
	public String index() {
		return "mainPage";
	}
<<<<<<< HEAD
	
<<<<<<< HEAD
<<<<<<< HEAD

	
=======
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
=======
	 @PostMapping("/room/roomList") public String list(HttpServletRequest request,
	  Model model) { roomService.reservationRoom(request, model); 
	   return "room/roomList"; 
	  }
	 
>>>>>>> a78cd674548878283bccbc5f14e6a311e8b9c410
=======
	 
	@GetMapping("/admin/index")
	public String adminPage() {
		return "admin/index";
	}
>>>>>>> 1617dbf7201103314e446b3f689dbb8249c0e013
	
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
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
	
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
	
}
