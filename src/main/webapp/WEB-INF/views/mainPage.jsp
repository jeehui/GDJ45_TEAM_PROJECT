<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Charis+SIL:wght@700&family=Kdam+Thmor+Pro&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://kit.fontawesome.com/148c1051b1.js" crossorigin="anonymous"></script>
<script src="../resources/js/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>

<style type="text/css">
	
	body{
		margin: 0;
		font-family: 'Kdam Thmor Pro', sans-serif;
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
	
	.searchBar{
		width: 70%;
		height: 70px;
		display: block;
		align-items: center;
		background-color: silver;
		padding-left: 130px;
	    padding-right: 105px;
	    margin-left: 143px;
		
	}
	
	
	 .searchBar{
		display: flex;
		align-items: center;
		font-size: 25px;
		color: white;
		padding-left: 160px;
		
	} 
	
	button {
	  margin: 5px;
	  outline: none;
	}
	.custom-btn {
	  width: 122px;
	  height: 45px;
	  padding: 8px 20px;
	  border: 2px solid #000;
	  font-family: 'Lato', sans-serif;
	  font-weight: 500;
	  font-size: 18px;
	  background: transparent;
	  cursor: pointer;
	  transition: all 0.3s ease;
	  position: relative;
	  display: inline-block;
	}
	
	/* 13 */
	.btn-13 {
	  background: #000;
	  color: #fff;
	  z-index: 1;
	}
	.btn-13:after {
	  position: absolute;
	  content: "";
	  width: 100%;
	  height: 0;
	  bottom: 0;
	  left: 0;
	  z-index: -1;
	  background: #fff;
	  transition: all 0.3s ease;
	}
	.btn-13:hover {
	  color: #000;
	}
	.btn-13:hover:after {
	  top: 0;
	  height: 100%;
	}
	.btn-13:active {
	  top: 2px;
	}
	.btn-14 {
	  background: #000;
	  color: #fff;
	  z-index: 1;
	}
	.btn-14:after {
	  position: absolute;
	  content: "";
	  width: 100%;
	  height: 0;
	  bottom: 0;
	  left: 0;
	  z-index: -1;
	  background: #fff;
	  transition: all 0.3s ease;
	}
	.btn-14:hover {
	  color: #000;
	}
	.btn-14:hover:after {
	  top: 0;
	  height: 100%;
	}
	.btn-14:active {
	  top: 2px;;
	}
	
	
	
</style>
</head>
<script type="text/javascript">
	
	//페이지 로드 이벤트
	
	$(document).ready(function(){
		
		
		 $("#checkIn").datepicker({
			 dateFormat: 'yymmdd'
		    });
		    
		 $("#checkOut").datepicker({
			 dateFormat: 'yymmdd'
		    });
		
		//폼의 서브밋 이벤트
		$('#f').on('submit', (ev)=>{
			
			if($('#checkIn').val() == '' || $('#checkOut').val() == ''){
				alert('날짜를 선택해주세요.');
				ev.preventDefault();
			}
			
		})
		
		

	})
	
  //함수
  
  
</script>
<body>
	<div class="head">
	<jsp:include page="./layout/header.jsp"></jsp:include>
	
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
	
	<div class="center">
		
		<form id="f" action="${contextPath}/room/roomList" method="post">
		
		<div class="searchBar">
			
			<div id="checkInOut" style= "padding-left: 200px;">
			CHECK IN/OUT
			<input type="text" id="checkIn" name="checkIn" style="padding-top: 8px;">
			~
			<input type="text" id="checkOut" name="checkOut" style="padding-top: 8px;">
			</div>	
			&nbsp;&nbsp;	
			<button class="custom-btn btn-13">검색</button>
			<button class="custom-btn btn-14" type="reset">초기화</button>
		</div>
		
		</form>
		
		<div class="weather_api">
		
			
		</div>
	</div>

	
<<<<<<< HEAD
	<a href="${contextPath}/reservation/reservationPage">예약 페이지</a>
=======
>>>>>>> 010c9273248c98ff3072eb90e5994d58066240ad
</body>

<footer>

	<div class="end_info">
	
		<div class="hotel_info"> 
		
			<div class="info">
				
			</div> 
			
		</div>
			<ul class="sns_info">
				<li><i class="fa-brands fa-facebook-square"></i></li>
				<li><i class="fa-brands fa-twitter-square"></i></li>
				<li><i class="fa-brands fa-instagram"></i></li>
			</ul>
				
		
	</div>

</footer>
</html>