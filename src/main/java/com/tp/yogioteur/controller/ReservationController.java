package com.tp.yogioteur.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tp.yogioteur.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("reservation/reservationPage")
	public String reservationPage() {
		return "reservation/reservationPage";
	}
	
	@GetMapping("reservation/reservationConfirm")
	public String reservationConfirm() {
		return "reservation/reservationConfirm";
	}
	
	@PostMapping("/payments")
	public void payments(HttpServletRequest request, HttpServletResponse response) {
		reservationService.payments(request, response);
	}
}
