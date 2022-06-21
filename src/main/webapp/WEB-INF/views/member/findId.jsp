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
<script src="https://momentjs.com/downloads/moment-with-locales.js"></script>
<script>

	$(document).ready(function(){
		fnFindId();
		fnEmailAuth();
	});
	
	
	
	function fnFindId(){
		$('#btnFindId').on('click', function(e){
			if(){
				alert('이름을 입력해주세요.');
				e.preventDefault();
				return false;
			}
			else if(authCodePass == false){
				alert('이메일 인증을 받아야합니다.');
				e.preventDefault();
				return false;
				
			}
		})
	}

	
		// 이메일 확인
		function fnEmailCheck(){
			return new Promise(function(resolve, reject) {
				// 정규식 
				let regEmail = /^[a-zA-Z0-9-_]+@[a-zA-Z0-9]+(\.[a-zA-Z]{2,}){1,2}$/; 
				if(regEmail.test($('#memberEmail').val())==false){
					reject(1000);      
					return;
				}
				// 중복 
				$.ajax({
					url: '${contextPath}/member/emailCheck',
					type: 'get',
					data: 'memberEmail=' + $('#memberEmail').val(),
					dataType: 'json',
					success: function(obj){
						if(obj.res == null){
							resolve();     
						} else {
							reject(2000); 
						}
					}
				})
			});
		}
		
		// 이메일 인증
		let authCodePass = false;
		function fnVerifyAuthCode(authCode){  
			$('#btnVerifyAuthCode').on('click', function(){
				if($('#authCode').val() == authCode){
					alert('인증되었습니다.');
					authCodePass = true;
				} else {
					alert('인증에 실패했습니다.');
					authCodePass = false;
				}
			})
		}
		
		// 이메일 인증발송
		function fnEmailAuth(){
			$('#btnGetAuthCode').on('click', function(){
				fnEmailCheck().then(
					function(){
						$.ajax({
							url: '${contextPath}/member/sendAuthCode',
							type: 'get',
							data: 'memberEmail=' + $('#memberEmail').val(),
							dataType: 'json',
							success: function(obj){  
								alert('인증코드를 발송했습니다. 이메일을 확인해주세요.');
								fnVerifyAuthCode(obj.authCode);  
							},
							error: function(jqXHR){
								alert('인증코드 발송이 실패했습니다.');
							}
						})
					}
				).catch(
					function(code){
						if(code == 1000){
							$('#memberEmailMsg').text('이메일 형식이 올바르지 않습니다.').addClass('dont').removeClass('ok');
							$('#authCode').prop('readonly', true);
						} else if(code == 2000){
							$('#memberEmailMsg').text('이미 사용 중인 이메일입니다.').addClass('dont').removeClass('ok');
							$('#authCode').prop('readonly', true);
						}
					}
				)
			})
		}

	
</script>
</head>
<body>
	
	<h3>아이디 찾기</h3>
	
	이름<br>
	<input type="text" name="memberName" id="memberName"><br><br>
	
	이메일<br>
	<input type="text" name="memberEmail" id="memberEmail">
	<input type="button" value="인증번호받기" id="btnGetAuthCode"><br>
	<span id="memberEmailMsg"></span><br>
	<input type="text" name="authCode" id="authCode" placeholder="인증코드 입력">
	<input type="button" value="인증하기" id="btnVerifyAuthCode"><br><br>
	
	<input type="button" value="확인" id="btnFindId">
	<input type="button" value="취소" onclick="location.href='${contextPath}/'"> 
	
	<div>
		<a href="${contextPath}/member/findPwPage">비밀번호 찾기</a> /
		<a href="${contextPath}/member/agreePage">회원가입</a>
	</div>
	
	<div id="findIdMsg"></div>
	
</body>
</html>