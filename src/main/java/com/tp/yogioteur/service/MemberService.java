package com.tp.yogioteur.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemberService {
	
	public Map<String, Object> idCheck(String id);
	public Map<String, Object> sendAuthCode(String email);
	public Map<String, Object> emailCheck(String email);
	public void signIn(HttpServletRequest request, HttpServletResponse response);
	
}
