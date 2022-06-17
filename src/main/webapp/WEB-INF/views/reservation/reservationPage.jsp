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
<script>
	$(document).ready(function(){
		fnMemberInfo();
		fnPayment();
	})
	function fnMemberInfo(){
		
	}
	function fnPayMent(){
		$('#payment').on('click', function(){
			if($('#privacy').is(':checked') == false){
				alert('필수 약관에 동의하세요.')
			}
			let member = JSON.stringify(
				{
					name: $('#name').val(),
					tel: $('#tel').val(),
					email: $('#email').val()
				}	
			);
			$.ajax({
				url: '${contextPath}/payments',
				type: 'POST',
				data: member,
				contentType: 'application/json',
				dataType: 'json',
				success: function(obj){
					if(res > 0){
						alert('결제가 되었습니다.');
						location.href='${contextPath}/예약 확인 페이지';
					} else {
						alert('');
					}
				}
			})
		})
	}
</script>
<style>

</style>
</head>
<body>

	<h1>예약 페이지</h1>
	<hr>
	
	<div>
		<img src="../resources/img/unnamed.jpg" width="50px" height="50px">
	</div>
	
	<hr>
	
	<div>
		조식 선택
		투숙 날짜
		객실 인원
	</div>
	
	<h3>예약자 정보</h3>
	<c:if test="${session != null }">
		<div>
			이름 <input type="text" name="name" id="name" value="${session.name}"><br>
			연락처 <input type="text" name="tel" id="tel" value="${session.tel}">
			이메일 <input type="text" name="email" id="email" value="${session.email}"><br>
			체크인 <input type="text" name="checkin" id="checkin" value="">
			체크아웃 <input type="text" name="checkout" id="checkout" value="">
		</div>
	</c:if>
	<c:if test="${session == null }">
		<div>
			이름 <input type="text" name="nonName" id="nonName" value="${session.nonName}">
			연락처 <input type="text" name="nonTel" id="nonTel" value="${session.nonTel}"><br>
		</div>
	</c:if>
	
	<textarea>개인정보보호법에 따라 ...</textarea><br>
	
	<input type="checkbox" id="privacy" class="blind checkOne">
	<label for="privacy" class="item">개인정보 수집에 동의합니다.</label><br>
	<br><br>
	
	<input type="button" value="돌아가기" onclick="location.href='${contextPath}/객실상세페이지/'">
	<input type="button" value="결제하기" id="payment">
	
</body>
</html>