<<<<<<< HEAD
/*
 * package com.tp.yogioteur.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.tp.yogioteur.service.FaqService; import
 * com.tp.yogioteur.service.FaqServiceImpl; import
 * com.tp.yogioteur.service.ReviewService; import
 * com.tp.yogioteur.service.ReviewServiceImpl; import
 * com.tp.yogioteur.service.RoomService; import
 * com.tp.yogioteur.service.RoomServiceImpl;
 * 
 * @Configuration public class ServiceConfig {
 * 
 * @Bean public RoomService roomService() { return new RoomServiceImpl(); }
 * 
 * @Bean public FaqService faqService() { return new FaqServiceImpl(); }
 * 
 * @Bean public ReviewService reviewService() { return new ReviewServiceImpl();
 * }
 * 
 * }
 */
=======
package com.tp.yogioteur.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp.yogioteur.service.MemberService;
import com.tp.yogioteur.service.MemberServiceImpl;
import com.tp.yogioteur.service.RoomService;
import com.tp.yogioteur.service.RoomServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
	@Bean
	public RoomService roomService() {
		return new RoomServiceImpl();
	}
	
}
>>>>>>> main
