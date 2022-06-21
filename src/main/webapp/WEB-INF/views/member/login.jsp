<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD

=======
    
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.ok {
		color: blue;
	}
	.dont {
		color: red;
	}
</style>
<script src="../resources/js/jquery-3.6.0.js"></script>
<script>
	
	$(function(){
		fnLogin(); 
	})
	
	let idPass = false;
	function fnLogin(){
<<<<<<< HEAD
		$('#Loginform').on('submit', function(e){
=======
		$('#LoginForm').on('submit', function(e){
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
			if($('#memberId').val() == '' || $('#memberPw').val() == ''){
				$('#memberId').text('아이디와 비밀번호를 모두 입력하세요.').addClass('dont').removeClass('ok');
				e.preventDefault();
				return false;
			}
			
		}) 
	}
<<<<<<< HEAD
	

=======
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
</script>
</head>
<body>

	<h1>로그인</h1>
	<form id="Loginform" action="${contextPath}/member/login" method="post">
		<input type="text" id="memberId" name="memberId" placeholder="아이디"><br>
		<span id="idMsg"></span>
		<input type="password" id="memberPw" name="memberPw" placeholder="비밀번호">
		<span id="pwMsg"></span>
		<button>로그인</button><br>
		
		<label>
			<input type="checkbox" id="rememberId">아이디저장
		</label>
		
	</form>
	
	
	<div>
		<a href="${contextPath}/member/findIdPage">아이디 찾기</a> |
		<a href="${contextPath}/member/findPwPage">비밀번호 찾기</a> |
		<a href="${contextPath}/member/agreePage">회원가입</a> 
	</div>


</body>
</html>