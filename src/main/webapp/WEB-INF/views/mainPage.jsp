<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>

	<!-- 로그인 이전 -->
		<a href ="${contextPath}/member/loginPage">로그인</a>
		<a href ="${contextPath}/member/agreePage">회원가입</a>		

	<!-- 로그인 이후 -->
		<a href ="${contextPath}/member/logioutPage">로그아웃</a>
		<a href ="${contextPath}/member/memberPage">마이페이지</a>		
	
	
	<h1>MAIN PAGE</h1>
	
	

</body>
</html>