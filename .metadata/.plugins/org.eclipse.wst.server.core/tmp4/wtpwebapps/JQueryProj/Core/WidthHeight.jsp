<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WidthHeight.jsp</title>
<style>
	div {
		width: 100px;
		height: 100px;
		background-color: green;
		padding: 20px;
		border: 5px red solid;
		margin: 20px;
	}
</style>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		//패딩,테두리,마진 모두 포함 안됨
		var div = $('div');
		var width = div.width();
		var height = div.height();
		//패딩,테두리 포함
		var outerWidth = div.outerWidth();
		var outerHeight = div.outerHeight();
		//패딩,테두리,마진 모두 포함
		var includeMargineWidth = div.outerWidth(true);
		var includeMargineHeight = div.outerHeight(true);
		
		$('button').click(function(){
			console.log('마진/패딩/테두리 미 포함 : 가로폭-%s, 세로폭-%s',width,height);
			console.log('패딩/테두리 포함 : 가로폭-%s, 세로폭-%s',outerWidth, outerHeight);
			console.log('마진/패딩/테두리 모두 포함 : 가로폭-%s, 세로폭-%s',includeMargineWidth, includeMargineHeight);
			
			console.log('css()함수 : 가로폭-%s, 세로폭-%s',div.css('width'), div.css('height'));
			
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>width(),height(),outerWidth(),outerHeight()</legend>
		<div></div>
		<button>가로폭/세로폭 구하기</button>
	</fieldset>
</body>
</html>