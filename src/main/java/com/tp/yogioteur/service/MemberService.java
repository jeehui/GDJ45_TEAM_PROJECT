package com.tp.yogioteur.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemberService {
	
	public Map<String, Object> idCheck(String memberId);
	public Map<String, Object> sendAuthCode(String memberEmail);
	public Map<String, Object> emailCheck(String memberEmail);
	public void signIn(HttpServletRequest request, HttpServletResponse response);
	
}
