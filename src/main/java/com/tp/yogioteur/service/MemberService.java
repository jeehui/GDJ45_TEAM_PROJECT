package com.tp.yogioteur.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tp.yogioteur.domain.MemberDTO;
import com.tp.yogioteur.domain.SignOutMemberDTO;

public interface MemberService {
	
	public Map<String, Object> idCheck(String memberId);
	public Map<String, Object> sendAuthCode(String memberEmail);
	public Map<String, Object> emailCheck(String memberEmail);
	public void signIn(HttpServletRequest request, HttpServletResponse response);
	
	// 로그인
	public MemberDTO login(HttpServletRequest request);
	
	// 탈퇴
	public SignOutMemberDTO findSignOutMember(String memberId);
	
	
	// 아이디 찾기
	public Map<String, Object> findId(MemberDTO member);
}
