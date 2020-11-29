<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShowHide.jsp</title>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<!-- 제이쿼리 코어 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- 제이쿼리 UI -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		//페이지 최초 로드시
		//$('.content').hide();
		//제목 클릭시 내용 보이기]
		//1]show() 함수 사용-show한 상태에서 제목 다시 클릭시 그대로다
		/*
		$('.title').click(function(){
			$(this).next().show(2000,function(){
				$(this).css('background-color','lightyellow');
			});
		});
		*/
		//2]toggle()함수 사용-제목을 다시 클릭시 토글링되어 보였던게(show)다시 숨겨진다(hide);
		/*
		$('.title').click(function(){
			$(this).next().toggle(500,function(){
				$(this).css('background-color','lightyellow');
			});
		});
		*/
		//문]toggle()함수 미사용-show()및 hide()함수를 이용해 제목 클릭 시 다른 제목의 내용이 열려진게 있다면 자동으로
		//	닫히도록 구현하여라 그리고 토글링 기능도 함께
		/*
		$('.title').click(function(){
			if($(this).next().css('display')=='none'){
				$('.content').hide(500);//열려있는 내용 닫긴
				$(this).next().show(500);//닫혀있는 내용 열기
			}
			else{
				$(this).next().hide(500);
			}
		});
		*/
		//제이쿼리 UI사용해서 위와 똑같은 기능 구현 한줄로
		$('#accordion').accordion({collapsible:true,active:false});		
	});
</script>
</head>
<body>
	<fieldset>
		<legend>show(),hide()함수</legend>
		<div id="accordion">
			<!-- 제이쿼리 UI적용시 추가DIV -->
			<div class="title" title="제목1">
				<h2>제목1</h2>
			</div>
			<div class="content">
				내용입니다1<br />
				내용입니다1<br />
				내용입니다1<br />
			</div>
			<div class="title" title="제목2">
				<h2>제목2</h2>
			</div>
			<div class="content">
				내용입니다2<br />
				내용입니다2<br />
				내용입니다2<br />
			</div>
			<div class="title" title="제목3">
				<h2>제목3</h2>
			</div>
			<div class="content">
				내용입니다3<br />
				내용입니다3<br />
				내용입니다3<br />
			</div>
		</div>
	</fieldset>
</body>
</html>