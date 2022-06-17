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
		
		var 
		
	}



	function fnRemove(no){		
			if(confirm('삭제할까요?')){
				location.href='${contextPath}/faq/remove?faqNo=' + $(no).data('faq_no');
			}
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
	
	<a href="${contextPath}/faq/faqSavePage">새글작성</a>
	
	<table border="1">
		<tbody>
			<c:forEach items="${faqs}" var="faq">
				<tr>
					<td>${faq.faqTitle}</td>
					<td>${faq.faqContent}</td>
					<td><input type="button" value="삭제" id="faqBtnRemove" data-faq_no = "${faq.faqNo}" onclick="fnRemove(this)"></td>
				</tr>	
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					${paging}
				</td>
			</tr>
		</tfoot>
	</table>
	
	
	
</body>
</html>