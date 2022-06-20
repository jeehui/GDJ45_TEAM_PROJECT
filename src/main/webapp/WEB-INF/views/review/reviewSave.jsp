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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script>

</script>
<style type="text/css">

	#memberStar input[type=radio]{
    display: none;
	}
	#memberStar label{
	    font-size: 3em;
	    color: transparent;
	    text-shadow: 0 0 0 #f0f0f0;
	}
	
	#memberStar input[type=radio]:checked ~ label{
	    text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
	}
</style>
</head>
<body>

   
   
  <h1>새 리뷰 작성</h1>
   
   <form id="reviewAdd" action="${contextPath}/review/save" method="post" enctype="multipart/form-data">
   		아이디 : ${member.memberId}
  		별점
  		
        
  		<input type="text" name="reviewTitle" placeholder="리뷰 제목"><br>
  		<textarea rows="10" cols="50" class="review_textarea" placeholder="리뷰 내용"></textarea><br>
   		
   		<fieldset name="memberStar" id="memberStar">
   			<span class="text-bold">별점을 선택해주세요</span>
			<input type="radio" name="reviewStar" value="1" id="rate1">
			<label for="rate1">★</label>
			
			<input type="radio" name="reviewStar" value="2" id="rate2">
			<label for="rate2">★</label>
			
			<input type="radio" name="reviewStar" value="3" id="rate3">
			<label for="rate3">★</label>
			
			<input type="radio" name="reviewStar" value="4" id="rate4">
			<label for="rate4">★</label>
			
			<input type="radio" name="reviewStar" value="5" id="rate5">
			<label for="rate5">★</label>	
			
   		</fieldset>
   		
   		<button>등록</button>
   
   </form>
   
   
   
</body>
</html>