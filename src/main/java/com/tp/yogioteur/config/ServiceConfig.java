package com.tp.yogioteur.config;

import org.springframework.context.annotation.Bean;
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
	
	@Bean
	public ReviewService reviewService() {
		return new ReviewServiceImpl();
	}
	
}
