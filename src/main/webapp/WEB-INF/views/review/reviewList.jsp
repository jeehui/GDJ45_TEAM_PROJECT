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
   
  	
	
	 function fnRemove(rn){      
	       if(confirm('삭제할까요?')){
	          location.href='${contextPath}/review/remove?reviewNo=' + $(rn).data('review_no');
	       }
	 }

</script>

</head>
<body>

   
   
   <h1>리뷰목록</h1>
   
   <a href="${contextPath}/review/reviewSavePage">새 리뷰 작성하기</a>
   
   <hr>
   
   <c:forEach items="${reviews}" var="review">
   		<div>
   			<div class="memberReview">
   				<div> 
   					회원 아이디 : 
   					사진
   					별점 : 
   				</div>
   				
   				<div>
   				 	
   				</div>
   				
   			</div>
   			<c:if test="${review.content} != null ">
	   			<div class="adminReviewReply">
   					<div>
   						관리자 댓글 : 
   					</div>
   				</div>
   			</c:if>
   			
   			<input type="button" value="삭제" name="reviewRemoveBtn" data-review_no="${review.reviewNo}" onclick="fnReviewRemove(this)">
   			
   		</div>
   </c:forEach>
   
   
   
   
   
</body>
</html>