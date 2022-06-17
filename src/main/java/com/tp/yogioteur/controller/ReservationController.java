package com.tp.yogioteur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tp.yogioteur.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("reservation/reservationPage")
	public String reservationPage() {
		return "reservation/reservationPage";
	}
	
//	@ResponseBody
//	@PostMapping(value="/payments")
}
