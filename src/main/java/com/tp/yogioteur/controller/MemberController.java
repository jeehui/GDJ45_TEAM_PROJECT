package com.tp.yogioteur.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tp.yogioteur.domain.MemberDTO;
import com.tp.yogioteur.service.MemberService;

@Controller
public class MemberController {
	
	// 회원가입
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/agreePage")
	public String agreePage() {
		return "member/agree";
	}
	
	@GetMapping("/member/signInPage")
	public String signInPage(@RequestParam(required=false) String[] agreements, Model model) {
		model.addAttribute("agreements", agreements);
		return "member/signIn";
	}
	
	@ResponseBody
	@GetMapping(value="/member/idCheck", produces="application/json")
	public Map<String, Object> idCheck(@RequestParam String memberId) {
		return memberService.idCheck(memberId);
	}
	
	
	@ResponseBody
	@GetMapping(value="/member/sendAuthCode", produces="application/json")
	public Map<String, Object> sendAuthCode(@RequestParam String memberEmail){
		return memberService.sendAuthCode(memberEmail);
	}
	
	@ResponseBody
	@GetMapping(value="/member/emailCheck", produces="application/json")
	public Map<String, Object> emailCheck(@RequestParam String memberEmail){
		return memberService.emailCheck(memberEmail);
	}

	@PostMapping("/member/signIn")
	public void signIn(HttpServletRequest request, HttpServletResponse response) {
		memberService.signIn(request, response);
	}
	

	
	// 로그인
	
	@GetMapping("/member/loginPage")
	public String loginPage() {
		return "member/login";
	}
	
	@PostMapping("/member/login")
	public void login(HttpServletRequest request, Model model) {
		
		MemberDTO loginMember = memberService.login(request);
		
		if(loginMember != null) {
			model.addAttribute("loginMember", loginMember);
		}
	}
	
	
	
	
	
}
