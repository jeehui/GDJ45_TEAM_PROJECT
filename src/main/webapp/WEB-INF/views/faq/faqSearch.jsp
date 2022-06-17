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

	$(function(){
		fnSearch();
	})
	
	function fnSearch(){
		
		var faqQuery = $('#faqQuery');
		
		$('#faqSearchBtn').on('click', function(){
			location.href="${contextPath}/faq/faqSearch?faqQuery=" + faqQuery.val();
			
		})
		
	}


</script>
</head>
<body>
	
	
	<h1>FAQ.자주묻는 질문</h1>
	
	<br>
	<form id="faqInput">
		<input type="text" id="faqQuery" name="faqQuery" >
		<input type="button"  id="faqSearchBtn" name="faqSearchBtn" value="검색">	
	</form>
	
	<br><br>
	
	<%@ include file="faqList.jsp" %>
	
</body>
</html>