<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../resources/js/jquery-3.6.0.js"></script>

<style type="text/css">
	
	body{
		margin: 0;
	}
	
	a{
		text-decoration: none;
		color: white;
	}
	
	.head{
		display: flex;
		justify-content: space-between;
		align-items: center;
		background-color: silver;
		padding: 8px 12px;
	}
	
	.header a{
		padding: 12px;
		display: inline-block;
		font-size: 18px;
	}
	
	.header a:hover {
		
		color: #999;
		
	}
	
		
	.title a{
		font-size: 22px;
	}
	
	.header2 a{
		padding: 12px;
		display: inline-block;
		font-size: 18px;
	}
	
	.header2 a:hover {
		
		color: #999;
		
	}
	
	
	
</style>
</head>
<body>
	
	<div class="head">
	
		<div class="header">
				<a href="${contextPath}/review/reviewPage">REVIEW</a>
				<a href="${contextPath}/faq/faqPage">FAQ</a>
		</div>
		
		<div class="title">
			<a href="${contextPath}/mainPage">YOGIOTEUR</a>
		</div>
		 
		<div class="header2">
				<a href="${contextPath}/login/loginPage" >로그인</a>
				<a href="${contextPath}/signUp/signUpPage" >회원가입</a>
		</div>
		
		
		
	</div>
	<div class="background">
		<img src="resources/images/hotel.jpg" alt="main" width="100%" height="850px">
	</div>
		검색창
	<div>
	
		
	
	</div>
	
</body>
</html>