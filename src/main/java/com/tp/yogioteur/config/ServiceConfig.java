package com.tp.yogioteur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp.yogioteur.service.MemberService;
import com.tp.yogioteur.service.MemberServiceImpl;

@Configuration
public class ServiceConfig {
	
<<<<<<< HEAD
	
=======
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
	
}
