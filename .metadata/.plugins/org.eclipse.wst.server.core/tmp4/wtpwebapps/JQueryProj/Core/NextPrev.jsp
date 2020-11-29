<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NextPrev.jsp</title>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		$('#next').click(function(){
			$('#third').next().css({color:'salmon',fontSize:'1.8em'});
			console.log('%O',$('#next').next());
		});
		$('#prev').click(function(){
			$('#third').prev().prev().css({color:'salmon',fontSize:'2em'});
		});
		//문]
		/*
		var i =0;
		$('#continue').click(function(){
			$('li:eq('+i+')').css({color:'salmon',fontSize:'2em'});
			$('li:eq('+i+')').prev().css({color:'black',fontSize:'1em'});
			i++;
			if(i==6) i=0;
		});
		*/
		var liObj = $('li:first');
	      var index = 0;
	      var length = $('li').length;
	      
	      $('#continue').click(function(){
	         if(index==0) $('li:last').css({color:'black'},fontSize:'1em');
	         else liObj.prev().css({color:'black',fontSize:'1em'});
	         liObj.css({color:'red',fontSize:'2em'});
	         index++;
	         if(index != length) liObj = liObj.next();
	         else {
	            index=0;
	            liObj = $('li:first');
	         }
	      });
	});</script>
</head>
<body>
	<fieldset>
		<legend>next() 및 prev()함수</legend>
		<button id="next">다음</button>
		<button id="prev">이전</button>
		<button id="continue">계속</button>
		​
		<ul>
			<li>JAVA</li>
			<li>JSP</li>
			<li id="third">FRAMEWORK</li>
			<li>JQUERY1</li>
			<li>JQUERY2</li>
			<li>JQUERY3</li>
		</ul>
	</fieldset>
</body>
</html>