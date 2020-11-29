<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JQueryFirst.jsp</title>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	//factory함수*(나중에 배움)
	//순수 자바스크립트만으로 구현]
	/*
	window.onload = function() {
		var span = document.getElementById("jQuery");
		span.style.color = 'tomato';
		span.innerHTML='<strong>프로그램 진입점</strong>';
		var legend = document.getElementsByTagName('legend')[0];
		legend.onclick = function(){
			span.style.color = 'black';
			span.innerHTML='JQuery 첫 수업입니다';
		};
	};*/
	//제이쿼리 사용]
	//프로그램 진입점-방법1]$(document).ready(function(){});
	//$(document).ready(); = window 같은 의미
	//.css / .html() 메소드쉐입
	/*
	$(document).ready(function(){
		$('#jQuery').css("color","tomato").html('<strong>프로그램 진입점</strong>');
		//var legend = document.getElementsByTagName('legend')[0];와 $("legend:eq(0)");는 의미가 같다
		$("legend:eq(0)").click(function(){
			$('#jQuery').css("color","black").html('JQuery 첫 수업입니다');
		});
	}); */
	//프로그램 진입접 - 방법2]$().ready(function(){});
	/*
	$().ready(function(){
		$('#jQuery').css("color","tomato").html('<strong>프로그램 진입점</strong>');
		//var legend = document.getElementsByTagName('legend')[0];와 $("legend:eq(0)");는 의미가 같다
		$("legend:eq(0)").click(function(){
			$('#jQuery').css("color","black").html('JQuery 첫 수업입니다');
		});
	}); */
	//프로그램 진입접 - 방법3]$(function(){});
	/*
	$(function(){
		$('#jQuery').css("color","tomato").html('<strong>프로그램 진입점</strong>');
		//var legend = document.getElementsByTagName('legend')[0];와 $("legend:eq(0)");는 의미가 같다
		$("legend:eq(0)").click(function(){
			$('#jQuery').css("color","black").html('JQuery 첫 수업입니다');
		});
	}); */
	//프로그램 진입접 - 방법4]jQuery();
	jQuery(function(){
		jQuery('#jQuery').css("color","tomato").html('<strong>프로그램 진입점</strong>');
		//var legend = document.getElementsByTagName('legend')[0];와 $("legend:eq(0)");는 의미가 같다
		jQuery("legend:eq(0)").click(function(){
			jQuery('#jQuery').css("color","black").html('JQuery 첫 수업입니다');
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>JQuery 첫 수업</legend>
		<span id="jQuery">JQuery 첫 수업입니다</span>
	</fieldset>
</body>
</html>