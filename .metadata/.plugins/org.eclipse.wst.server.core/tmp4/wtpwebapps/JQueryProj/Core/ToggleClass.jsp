<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToggleClass.jsp</title>
<style>
	div {
		width: 100px;
		height: 100px;
		background-color: pink;
		border: 1px purple solid
	}
	.invisible{
		display:none;
	}
</style>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<c:url value="/js/jquery-migrate-1.4.1.js"/>"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		/*
		1.9이전 버전의 toggle()함수로
		toggleClass()처럼 구현하기-removeCalss('클래스명')와 addClass("클래스명")
		*/
		/*
		$('button').toggle(function(){
			$('div').addClass('invisible');
			$(this).html('보이기');
		}, function(){
			$('div').removeClass('invisible');
			$(this).html('안보이기');
		});
		*/
		$('button').click(function(){
			$('div').toggleClass('invisible');
			$(this).html($(this).html()=='보이기'?'안보이기':'보이기');
		})
	});
</script>
</head>
<body>
	<fieldset>
		<legend>toggleClass('클래스명')</legend>
		<div></div>
		<button>안보이기</button>
	</fieldset>
</body>
</html>