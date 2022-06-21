package com.tp.yogioteur.service;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface RoomService {
	
	public void reservationRoom(HttpServletRequest request, Model model);
	
=======
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface RoomService {

	public void save(MultipartHttpServletRequest multipartRequest, HttpServletResponse response);
>>>>>>> sungjae
}
