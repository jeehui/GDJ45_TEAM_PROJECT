package com.tp.yogioteur.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tp.yogioteur.domain.SignOutMemberDTO;
import com.tp.yogioteur.service.MemberService;
import com.tp.yogioteur.util.SecurityUtils;

public class LoginInterceptor implements HandlerInterceptor {
	
	@Autowired
	private MemberService memberService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember") != null) {
			session.removeAttribute("loginMember");
		}
		
		String memberId = SecurityUtils.xss(request.getParameter("memberId"));
		
		SignOutMemberDTO SignOutMember = memberService.findSignOutMember(memberId);
		if(SignOutMember != null) {
			request.setAttribute("SignOutMember", SignOutMember);
			request.getRequestDispatcher("/member/reSignInPage").forward(request, response);
			return false;
		}
		return true;
	}
	
	
	
}
