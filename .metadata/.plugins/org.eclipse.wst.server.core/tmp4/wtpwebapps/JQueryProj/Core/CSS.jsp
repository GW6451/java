<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSS.jsp</title>
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
		//[속성값 읽기] - css("css의 속성명")
		$('#get').on('click',function(){
			var div = $('div');
			var width = div.css('width');
			var height = div.css('height');
			console.log('가로폭:%s,세로폭:%s',width,height);
			//css속성명 그대로..
			//var back = div.css('background-color');
			//자바스크립트 접근 방식으로
			var back = div.css('backgroundColor');
			console.log('배경색:%s,%s',back,div.get(0).style.backgroundColor);
			$('span').html('결과값:가로폭-'+width+',세로폭-'+height+',배경색-'+back);
		});
		//[속성값 설정]- css('속성명','설정할 값')
		$('#set').click(function(){
			//메소드 체인으로]
			//$('div').css('width','200px').css('height','200px').css('backgroundColor','skyblue');
			//JSON타입으로
			$('div').css({width:'150px','height':'150px',"background-color":"skyblue"});
		});
		var aTag = $('a').click(function(){});
		
		var pTag = $('#article');
		$('a').click(function(){
			//클릭시 현재글자 크기 얻기
			var fontSize = parseInt(pTag.css('font-size'));
			switch($(this).html()){
			case '크게' : pTag.css('font-size',fontSize+5+'px'); break;
			case '작게' : pTag.css('font-size',fontSize-5+'px'); break;
			case '진하게' : pTag.css('font-weight','bold'); break;
			case '보통' : pTag.css('font-weight','normal'); break;
			case '빨강' : pTag.css('color','red'); break;
			case '그린' : pTag.css('color','green'); break;
			case '검정' : pTag.css('color','black'); break;
			case '빨강' : pTag.css('color','red'); break;
			case '기울이기' : pTag.css('font-style','italic'); break;
			default : pTag.css('font-style','normal');
			}
		});
		/*
		$('a:eq(0)').click(function(){
			$('p').css('font-size','1.2em');
		});
		$('a:eq(1)').click(function(){
			$('p').css('font-size','0.8em');
		});
		$('a:eq(2)').click(function(){
			$('p').css('font-weight','bold');
		});
		$('a:eq(3)').click(function(){
			$('p').css('font-weight','normal');
		});
		$('a:eq(4)').click(function(){
			$('p').css('color','red');
		});
		$('a:eq(5)').click(function(){
			$('p').css('color','green');
		});
		$('a:eq(6)').click(function(){
			$('p').css('color','black');
		});
		$('a:eq(7)').click(function(){
			$('p').css('font-style','italic');
		});
		$('a:eq(8)').click(function(){
			$('p').css('font-style','normal');
		});
		*/
	});
</script>
</head>
<body>
	<fieldset>
		<legend>string css("css속성명"),jQuery css("css속성명","속성값")</legend>
		​ <span style="color: purple; font-size: 1.5em">결과값:</span>
		<div style="width: 100px; height: 100px; background-color: pink"></div>
		<button id="get">속성값 읽기</button>
		<button id="set">속성값 설정</button>
		<hr />
		<a href="#">크게</a> | <a href="#">작게</a> | <a href="#">진하게</a> |
		<a href="#">보통</a> | <a href="#">빨강</a> | <a href="#">그린</a> |
		<a href="#">검정</a> | <a href="#">기울이기</a> | <a href="#">똑바로</a>
		<p id="article" style="font-size: 12px">
			기사 내용입니다<br />
			기사 내용입니다<br />
			기사 내용입니다<br />
			기사 내용입니다<br />
			기사 내용입니다<br />
		</p>
	</fieldset>
</body>
</html>