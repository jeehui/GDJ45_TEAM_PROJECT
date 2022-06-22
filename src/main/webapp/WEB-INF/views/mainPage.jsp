<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>

	<!-- 로그인 이전 -->
	<c:if test="${loginMember eq null}">
		<a href ="${contextPath}/member/loginPage">로그인</a>
		<a href ="${contextPath}/member/agreePage">회원가입</a>			
	</c:if>

	<!-- 로그인 이후 -->
	<c:if test="${loginMember ne null}">
		${loginMember.memberId}
		<a href ="${contextPath}/member/logout">로그아웃</a>
		<a href ="${contextPath}/member/memberPage">마이페이지</a>		
	
	</c:if>
	
	<h1>MAIN PAGE</h1>
	
	<!-- 테스트 -->
	<a href="${contextPath}/board/reviewPage">리뷰작성</a>
	<a href="${contextPath}/reservation/reservationPage">예약</a>

</body>
</html>