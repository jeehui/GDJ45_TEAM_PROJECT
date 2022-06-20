package com.tp.yogioteur.service;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.yogioteur.domain.MemberDTO;
import com.tp.yogioteur.mapper.MemberMapper;
import com.tp.yogioteur.util.SecurityUtils;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public Map<String, Object> idCheck(String id) {
		Map<String, Object> map = new HashMap<>();
		map.put("res", memberMapper.selectMemberById(id));
		return map;
	}
	
	
	// 인증코드 발송
	@Override
	public Map<String, Object> sendAuthCode(String email) {
		String authCode = SecurityUtils.authCode(6);  
		System.out.println(authCode);
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.smtp.port", "587");            
		props.put("mail.smtp.auth", "true");           
		props.put("mail.smtp.starttls.enable", "true"); 
		

		final String USERNAME = "forspringlec@gmail.com";
		final String PASSWORD = "ukpiajijxfirdgcz";     
		

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(USERNAME, PASSWORD);
			}
		});
		
		try {
			
			Message message = new MimeMessage(session);
			
			message.setHeader("Content-Type", "text/plain; charset=UTF-8");
			message.setFrom(new InternetAddress(USERNAME, "인증코드관리자"));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("인증 요청 메일입니다.");
			message.setText("인증번호는 " + authCode + "입니다.");
			
			Transport.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("authCode", authCode);
		return map;
	}
	
	@Override
	public Map<String, Object> emailCheck(String email) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("res", memberMapper.selectMemberByEmail(email));
		return map;
	}
	
	@Override
	public void signIn(HttpServletRequest request, HttpServletResponse response) {
		String id = SecurityUtils.xss(request.getParameter("id"));        
		String pw = SecurityUtils.sha256(request.getParameter("pw"));    
		String name = SecurityUtils.xss(request.getParameter("name"));   
		Integer phone = Integer.parseInt(request.getParameter("phone"));    
		Integer birth = Integer.parseInt(request.getParameter("birth"));   
		String email = SecurityUtils.xss(request.getParameter("email")); 
		String info = request.getParameter("info");
		String event = request.getParameter("event");
		int agreeState = 1;  
		if(info.equals("info") && event.equals("event")) {
			agreeState = 4; 
		} else if(info.equals("info") && event.isEmpty()) {
			agreeState = 2;  
		} else if(info.isEmpty() && event.equals("event")) {
			agreeState = 3;  
		}

		
		MemberDTO member = MemberDTO.builder()
				.memberId(id)
				.memberPw(pw)
				.memberName(name)
				.memberPhone(phone)
				.memberBirth(birth)
				.memberEmail(email)
				.agreeState(agreeState)
				.build();

		int res = memberMapper.insertMember(member);
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			if(res == 1) {
				out.println("<script>");
				out.println("alert('회원 가입되었습니다.')");
				out.println("location.href='" + request.getContextPath() + "'");
				out.println("</script>");
				out.close();
			} else {
				out.println("<script>");
				out.println("alert('회원 가입에 실패했습니다.')");
				out.println("history.back()");
				out.println("</script>");
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
