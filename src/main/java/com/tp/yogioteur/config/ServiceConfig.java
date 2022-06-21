package com.tp.yogioteur.config;

<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
=======
<<<<<<< HEAD
>>>>>>> main
import org.springframework.context.annotation.Configuration;

import com.tp.yogioteur.service.FaqService;
import com.tp.yogioteur.service.FaqServiceImpl;
import com.tp.yogioteur.service.ReviewService;
import com.tp.yogioteur.service.ReviewServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public FaqService faqService() {
		return new FaqServiceImpl();
	}
	
<<<<<<< HEAD
	@Bean
	public ReviewService reviewService() {
		return new ReviewServiceImpl();
	}
=======
=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp.yogioteur.service.RoomService;
import com.tp.yogioteur.service.RoomServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public RoomService roomService() {
		return new RoomServiceImpl();
	}
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
>>>>>>> main
	
}
