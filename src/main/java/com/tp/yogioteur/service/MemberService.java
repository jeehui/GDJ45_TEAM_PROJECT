package com.tp.yogioteur.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.springframework.ui.Model;

import com.tp.yogioteur.domain.MemberDTO;
import com.tp.yogioteur.domain.SignOutMemberDTO;

public interface MemberService {
	// 회원가입
=======
public interface MemberService {
	
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
	public Map<String, Object> idCheck(String memberId);
	public Map<String, Object> sendAuthCode(String memberEmail);
	public Map<String, Object> emailCheck(String memberEmail);
	public void signIn(HttpServletRequest request, HttpServletResponse response);
	
<<<<<<< HEAD
	// 로그인
	public MemberDTO login(HttpServletRequest request);
	public SignOutMemberDTO findSignOutMember(String memberId);
	
=======
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
}
