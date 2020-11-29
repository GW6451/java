<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EachTrim.jsp</title>
<style>
	div{
		background-color: lightblue;
		color: white;
		font-weight: bold;
		outline: 1px skyblue solid
	}
</style>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<c:url value="/js/jquery-migrate-1.4.1.js"/>"></script>
<script>
	//factory함수*(나중에 배움)
	$(function() {
		var mountains = [ '한라산', '지리산', '덕유산' ];
		$.each(mountains, function(index, element) {
			console.log('%s : %s', index, element);
		});

		var person = {
			name : '가길동',
			'age' : 20,
			addr : '가산동'
		};
		person.gender = '남자';
		$.each(person, function(key, value) {
			console.log('%s : %s', key, value);
		});
		console.log('트림 전 : X' + '     T   R         I    M' + 'Y');
		console.log('트림 후 : X' + $.trim('     T   R         I    M') + 'Y');

		console.log($.browser);
		jQuery.each(jQuery.browser, function(i, val) {
			/*
			$("<div>" + i + " : <span>" + val + "</span>")
			.appendTo(document.body);*/
			$(document.body).append("<div>" + i + " : <span>" + val + "</span>");
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>$.each()함수 및 $.trim()</legend>
	</fieldset>
</body>
</html>