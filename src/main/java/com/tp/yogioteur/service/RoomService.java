package com.tp.yogioteur.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface RoomService {
	
	public void reservationRoom(HttpServletRequest request, Model model);
	
}
