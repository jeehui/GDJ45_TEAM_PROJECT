package com.tp.yogioteur.config;

<<<<<<< HEAD
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	
=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

<<<<<<< HEAD
import com.tp.yogioteur.service.MemberService;
import com.tp.yogioteur.service.MemberServiceImpl;
=======
import com.tp.yogioteur.service.RoomService;
import com.tp.yogioteur.service.RoomServiceImpl;
>>>>>>> c59662fb02f93b207bba363601958b80bf9b2233

@Configuration
public class ServiceConfig {
	
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
>>>>>>> jieun
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
=======
	@Bean
	public RoomService roomService() {
		return new RoomServiceImpl();
>>>>>>> c59662fb02f93b207bba363601958b80bf9b2233
	}
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
	
}
