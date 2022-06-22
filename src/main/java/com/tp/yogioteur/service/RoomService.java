package com.tp.yogioteur.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface RoomService {
	
	public void reservationRoom(HttpServletRequest request, Model model);
	
	public void saveRoom(MultipartHttpServletRequest request, HttpServletResponse response);

	public Map<String, Object> findRooms();
	
}
