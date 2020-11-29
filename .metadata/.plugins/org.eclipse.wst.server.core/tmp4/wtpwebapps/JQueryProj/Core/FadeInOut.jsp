<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FadeInOut.jsp</title>
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
		$('.content').hide();
		//제목 클릭시 내용 보이기]
		//1]slideDown()함수 사용
		/*
		$('.title').click(function(){
			$(this).next().fadeIn(2000,function(){
				$(this).css('background-color','lightyellow');
			});
		});
		*/
		//2]함수 사숑 - slideDown / slideUp 함께 사용한 것과 같음
		/*
		$('.title').click(function(){
			$(this).next().fadeToggle(500,function(){
				$(this).css('background-color','lightyellow');
			});
		});
		*/
		
		//3]
		$('.title').click(function(){
			if($(this).next().css('display')=='none'){
				$('.content').fadeOut(500);//열려있는 내용 닫긴
				$(this).next().fadeIn(500);//닫혀있는 내용 열기
			}
			else{
				$(this).next().fadeOut(500);
			}
		});
		
	});
</script>
</head>
<body>
	<fieldset>
		<legend>fadeIn(),fadeOut()함수,fadeToggle()</legend>
		<div id="accordion">
			<div class="title" title="제목1">
				<h2>제목1</h2>
			</div>
			<div class="content">
				내용입니다1<br /> 내용입니다1<br /> 내용입니다1<br />
			</div>
			<div class="title" title="제목2">
				<h2>제목2</h2>
			</div>
			<div class="content">
				내용입니다2<br /> 내용입니다2<br /> 내용입니다2<br />
			</div>
			<div class="title" title="제목3">
				<h2>제목3</h2>
			</div>
			<div class="content">
				내용입니다3<br /> 내용입니다3<br /> 내용입니다3<br />
			</div>
		</div>
	</fieldset>
</body>
</html>