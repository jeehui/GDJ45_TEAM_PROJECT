package com.tp.yogioteur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.yogioteur.mapper.reservationMapper;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private reservationMapper reservationMapper;
	
	
}
