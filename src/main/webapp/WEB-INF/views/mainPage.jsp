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
<style type="text/css">
	
	.body header{
		list-style: none;
	}

</style>
</head>
<body>
	
	<div class="header">
	
	<ul>
	<li>
	<a href="${contextPath}/review/reviewPage" class="review">REVIEW</a>
	<a href="${contextPath}/faq/faqPage" class="review">FAQ</a>
	</li>
	</ul>
	
	
	</div>
	
	
	
	
</body>
</html>