<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Selector02.jsp</title>
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
		/*
		eq(0)과 first: 자식, 부모관계 상관없이 선택된 객체에서 첫번째 객체를 의미
		first-child:자식, 부모관계에서 첫번째 자식인 객체
		*/
		console.log('ul태그의 수 :',$('ul').length);
		console.log($('첫번째 자식인 ul태그의 수',$('ul:first-child').length));
		//li태그 중 짝수번째는 글자 색을 pink 홀수번째는 skyblue
		//방법1]ul:eq(0)의 의미 - ul태그 중에서 첫번째 ul태그
//		$('ul:eq(0) li:even').css('color','pink');
//		$('ul:eq(0) li:odd').css('color','skyblue');
		//방법2]ul:first의 의미 - ul태그 중에서 첫번째 ul태그
		$('ul:first li:even').css('color','pink');
		$('ul:first li:odd').css('color','skyblue');
		
//		$('ul:last-child li:first-child').css('backgroundColor','lightyellow');
//		$('ul:last li:last').css('backgroundColor','lightyellow');
		$('ul:last li:eq(0)').css('backgroundColor','lightyellow');
		var size = $('ul:last li').length;
		
		$('ul:last li:eq('+(size-1)+')').css('backgroundColor','lightgreen');
	});
</script>
</head>
<body>
	<fieldset>
		<legend>선택자 두번째</legend>
		<ul>
			<li>가</li>
			<li>나</li>
			<li>다</li>
			<li>라</li>
		</ul>
		<ul>
			<li>A</li>
			<li>B</li>
			<li>C</li>
			<li>D</li>
			<li>E</li>
			<li>F</li>
			<li>G</li>
		</ul>
	</fieldset>
</body>
</html>