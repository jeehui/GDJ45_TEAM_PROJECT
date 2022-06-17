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
		fnListSelect();
	})

	function fnRemove(no){		
			if(confirm('삭제할까요?')){
				location.href='${contextPath}/faq/remove?faqNo=' + $(no).data('faq_no');
			}
	}
	
	function fnListSelect(){
		$('#faqListSel').on('click', function(){
			location.href="${contextPath}/faq/faqList";
		})
	}

</script>
<style>
	ul, li {
		list-style:none;
	}
	.btnToggle:hover .{
		display :block;
	}
	
</style>
</head>
<body>

	
	
	
	
	<a href="${contextPath}/faq/faqSavePage">새글작성</a>
	
	<input type="button" value="목록보기" id="faqListSel">
	
	<ul class ="toggleList">
			<c:forEach items="${faqs}" var="faq">
				<li>
					<div class="titArea">
						<span>${faq.faqTitle}</span>
						<button type="button" class="btnToggle">상세내용보기</button>
					</div>
					<div class="toggleCont">
						<div class="toggleInner">${faq.faqContent}</div>
					</div>
					<input type="button" value="삭제" id="faqBtnRemove" data-faq_no = "${faq.faqNo}" onclick="fnRemove(this)">
				</li>	
			</c:forEach>
	</ul>
			<div>${paging}</div>
	
	
	
</body>
</html>