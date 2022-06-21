<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<<<<<<< HEAD
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
		fnSignIn();
		fnIdCheck();
		fnPwCheck();
		fnPwConfirm();
		fnEmailAuth();
		fnPhoneCheck();
		fnBirthCheck();
	})
	// 가입
	function fnSignIn(){
		$('#form').on('submit', function(event){
			if(idPass == false){
				alert('아이디를 확인하세요.');
				event.preventDefault();
				return false;
			}
			else if(pwPass == false || rePwPass == false){
				alert('비밀번호를 확인하세요.');
				event.preventDefault();
				return false;
			}
			else if(authCodePass == false){
				alert('이메일 인증을 받아야 합니다.');
				event.preventDefault();
				return false;
			}
			else if(phonePass == false){
				alert('전화번호를 확인하세요.');
				event.preventDefault();
				return false;
			}
			else if(birthPass == false){
				alert('생년월일을 확인하세요.');
				event.preventDefault();
				return false;
			}
			return true;
		})
	}
	
	// 생년월일 정규식
	let birthPass = false;
	function fnBirthCheck(){
		$('#birth').on('keyup', function(){
			let regBirth = /^([0-9][0-9]|20\d{2})(0[0-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$/;
			if(regBirth.test($('#birth').val())==false){
				$('#birthMsg').text('생년월일은 주민번호 앞자리만 입력해주세요.').addClass('dont').removeClass('ok');
				birthPass = false;
			} else {
				$('#birthMsg').text('');
				birthPass = true;
			}
		})
	}
	
	
	// 연락처 정규식
	let phonePass = false;
	function fnPhoneCheck(){
		$('#phone').on('keyup', function(){
			let regPhone = /^[0-9]{1,11}$/;
			if(regPhone.test($('#phone').val())==false){
				$('#phoneMsg').text('전화번호는 -없이 숫자로만 입력해주세요.').addClass('dont').removeClass('ok');
				phonePass = false;
			} else {
				$('#phoneMsg').text('');
				phonePass = true;
			}
		})
	}
	
	
	// 이메일 확인
	function fnEmailCheck(){
		return new Promise(function(resolve, reject) {
			// 정규식 
			let regEmail = /^[a-zA-Z0-9-_]+@[a-zA-Z0-9]+(\.[a-zA-Z]{2,}){1,2}$/; 
			if(regEmail.test($('#email').val())==false){
				reject(1000);      
				return;
			}
			// 중복 
			$.ajax({
				url: '${contextPath}/member/emailCheck',
				type: 'get',
				data: 'email=' + $('#email').val(),
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
						data: 'email=' + $('#email').val(),
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
						$('#emailMsg').text('이메일 형식이 올바르지 않습니다.').addClass('dont').removeClass('ok');
						$('#authCode').prop('readonly', true);
					} else if(code == 2000){
						$('#emailMsg').text('이미 사용 중인 이메일입니다.').addClass('dont').removeClass('ok');
						$('#authCode').prop('readonly', true);
					}
				}
			)
		})
	}
	
	// 비밀번호 재확인
	let rePwPass = false;
	function fnPwConfirm(){
		$('#pwConfirm').on('keyup', function(){
			if($('#pwConfirm').val() != '' && $('#pw').val() != $('#pwConfirm').val()){
				$('#pwConfirmMsg').text('비밀번호를 확인해주세요.').addClass('dont').removeClass('ok');
				rePwPass = false;
			} else {
				$('#pwConfirmMsg').text('');
				rePwPass = true;
			}
		})
	}
	
	
	// 비밀번호 정규식
	let pwPass = false;
	function fnPwCheck(){
		$('#pw').on('keyup', function(){
			let regPw = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,12}$/; 
			if(regPw.test($('#pw').val())==false){
				$('#pwMsg').text('영문 소문자, 숫자, 특수문자 포함 8~12자로 입력해주세요.').addClass('dont').removeClass('ok');
				pwPass = false;
			} else {
				$('#pwMsg').text('사용 가능한 비밀번호입니다.').addClass('ok').removeClass('dont');
				pwPass = true;
			}
		})
	}
	
	
	// 아이디(중복&정규식)
	let idPass = false;
	function fnIdCheck(){
		$('#id').on('keyup', function(){
			// 정규식 
			let regId = /^[A-Za-z0-9]{6,12}$/; 
			if(regId.test($('#id').val())==false){
				$('#idMsg').text('아이디는 영어 소문자,숫자 포함 6~12자리로 입력해주세요.').addClass('dont').removeClass('ok');
				idPass = false;
				return;
			}
			// 아이디 중복 체크
			$.ajax({
				url: '${contextPath}/member/idCheck',
				type: 'get',
				data: 'id=' + $('#id').val(),
				dataType: 'json',
				success: function(obj){
					if(obj.res == null){
						$('#idMsg').text('사용가능한 아이디입니다.').addClass('ok').removeClass('dont');
						idPass = true;
					} else {
						$('#idMsg').text('이미 사용중이거나 탈퇴한 아이디입니다.').addClass('dont').removeClass('ok');
						idPass = false;
					}
				},
				error: function(jqXHR){
					$('#idMsg').text(jqXHR.responseText).addClass('dont').removeClass('ok');
					idPass = false;
				}
			})
		})
	}
</script>
</head>
<body>
	
	<h3>회원가입</h3>
	
	<form id="form" action="${contextPath}/member/signIn" method="post">
	
		<input type="hidden" name="info" value="${agreements[0]}">
		<input type="hidden" name="event" value="${agreements[1]}">
		
		<label for="id">
			아이디<br>
			<input type="text" name="id" id="id"><br>
			<span id="idMsg"></span>
		</label><br><br>
		
		<label for="pw">
			비밀번호<br>
			<input type="password" name="pw" id="pw"><br>
			<span id="pwMsg"></span>
		</label><br><br>

		<label for="pwConfirm">
			비밀번호 재확인<br>
			<input type="password" id="pwConfirm"><br>
			<span id="pwConfirmMsg"></span>
		</label><br><br>
		
		<label for="name">
			이름<br>
			<input type="text" name="name" id="name"><br>
		</label><br><br>
		
		<label for="phone">
			연락처<br>
			<input type="text" name="phone" id="phone"><br>
			<span id="phoneMsg"></span>
		</label><br><br>
		
		<label for="birth">
			생년월일<br>
			<input type="text" name="birth" id="birth"><br>
			<span id="birthMsg"></span>
		</label><br><br>
		
		<label for="email">
			이메일<br>
			<input type="text" name="email" id="email">
			<input type="button" value="인증번호받기" id="btnGetAuthCode"><br>
			<span id="emailMsg"></span><br>
			<input type="text" name="authCode" id="authCode" placeholder="인증코드 입력">
			<input type="button" value="인증하기" id="btnVerifyAuthCode"><br><br>
		</label>
		
		
		<button>회원가입</button>
		<input type="button" value="취소하기" onclick="location.href='${contextPath}'"> 
	</form>
=======
</head>
<body>

	<jsp:include page="../layout/header.jsp"></jsp:include>
<H1>회원가입</H1>
>>>>>>> c59662fb02f93b207bba363601958b80bf9b2233

</body>
</html>