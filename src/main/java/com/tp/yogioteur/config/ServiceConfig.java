package com.tp.yogioteur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp.yogioteur.service.MemberService;
import com.tp.yogioteur.service.MemberServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
	
}
