<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AnimateStop.jsp</title>
<style>
* {
	padding: 0;
	margin: 0;
}
div {
	width: 50px;
	height: 50px;
	background-color: salmon;
	position: relative;
	left: 0;
	top: 0;
}
</style>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		$('#start').click(function(){
			$('#div').animate({width:'+=100',height:'+=100',left:'+=100',backgroundColor: "yellow",opacity:0.25},5000,function(){
				console.log('애니메이션이 완료되었습니다');
			});
		});
		$('#stop').click(function(){
			$('#div').stop();
		});
		$('#back').click(function(){
			$('#div').animate({width:'50px',height:'50px',left:'0',backgroundColor: "salmon",opacity:1},5000);
		});
	});
</script>
</head>
<body>
	<div id="div"></div>
	<button id="start">Start</button>
	<button id="stop">Stop</button>
	<button id="back">Back</button>
</body>
</html>