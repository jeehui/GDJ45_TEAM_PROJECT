package com.tp.yogioteur.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.tp.yogioteur.service.ReservationService;
import com.tp.yogioteur.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@PostMapping("/room/save")
	public void save(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) {
		roomService.save(multipartRequest, response);
	}
	
}
