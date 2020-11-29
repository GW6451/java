<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IS.jsp</title>
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
		$('legend').click(function(){
			console.log($(':checkbox').is(':checked'));
			console.log($('#mydiv').is('div'));
		});
		$('#mydiv').children().each(function(){
			//문]
			if($(this).is(':text:eq(1)'))
				$(this).css({border:'none',borderBottom:'1px green solid'});
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>boolean is(선택자)</legend>
		<input type="checkbox" />동의
		<p id="mydiv">
			<input type="text" />
			<input type="text" />
			<input type="button" value="버튼" />
			<input type="file" />
		</p>
	</fieldset>
</body>
</html>