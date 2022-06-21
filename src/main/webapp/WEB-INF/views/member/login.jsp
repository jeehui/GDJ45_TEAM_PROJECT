<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.ok {
		color: green;
	}
	.dont {
		color: red;
	}
</style>
<script src="../rsources/js/jquery-3.6.0.js"></script>
<script>
	
	$(function(){
		fnLogin(); 
	})
	
	let idPass = false;
	function fnLogin(){
		$('#form').on('submit', function(){
			if($('#id').val() == ''){
				$('#idMsg').text('아이디를 입력해 주세요.').addClass('dont').removeClass('ok');
				idPass = false;
				return;
			}
			
			
		}) 
	}
</script>
</head>
<body>

	<jsp:include page="../layout/header.jsp"></jsp:include>
			

	<h1>로그인</h1>
	<form id="form" action="${contextPath}/member/login" method="post">
		<input type="text" id="id" name="id" placeholder="아이디"><br>
		<span id="idMsg"></span>
		<input type="text" id="pw" name="pw" placeholder="비밀번호">
		<span id="pwMsg"></span>
		<button>로그인</button><br>
		
		<label>
			<input type="checkbox" id="rememberId">아이디저장
		</label>
		
	</form>
	
	
	<div>
		<a href="${contextPath}/member/findIdPage">아이디 찾기</a> |
		<a href="${contextPath}/member/findPwPage">비밀번호 찾기</a> 
	</div>


</body>
</html>