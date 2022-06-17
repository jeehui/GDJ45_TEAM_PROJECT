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
	
	.weather_api{
		width: 100%;
		height: 300px;
		display: flex;
	}
	
	.searchBar{
		display: flex;
		align-items: center;
		font-size: 20px;
		color: white;
		
	}
	
	
</style>
</head>
<script>
$( function() {
	 $("#checkIn").datepicker({
	    });
	    var myDate = new Date();
	    var month = myDate.getMonth() + 1;
	    var checkIn = myDate.getFullYear() + '.' + month+ '.' + myDate.getDate();
	    $("#checkIn").val(checkIn);
	    
	 $("#checkOut").datepicker({
	    });
	    var myDate = new Date();
	    var month = myDate.getMonth() + 1;
	    var checkOut = myDate.getFullYear() + '.' + month+ '.' + myDate.getDate();
	    $("#checkOut").val(checkOut);
	    
  } );
</script>
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
	
	<div class="center">
		
		<div class="searchBar">
			
			<div id="checkInOut">
			CHECK IN/OUT
			<input type="text" id="checkIn">
			~
			<input type="text" id="checkOut">
			</div>			
		</div>
		
		<div class="weather_api">
		
			api
		
		</div>
	</div>
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