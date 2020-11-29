<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attr.jsp</title>
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
		$('button').click(function(){
			switch(this.id){
				case 'read' :
					var htmlString = $('div:eq(0)').html();
					var textString = $('div:eq(0)').text();
					console.log('html():%s,text():%s',htmlString,textString);
					break;
				case 'write' :
					//$('#display').html('<h3>시작태그와 종료태그 사이에 넣기(html함수 사용)</h3>');
					$('#display').text('<h3>시작태그와 종료태그 사이에 넣기(html함수 사용)</h3>');
					break;
				case 'img':
					$('#display').html("<img src='<c:url value="/Images/1.jpg" />'/>");
					break;
				default:
					console.log($(this).html());
			};
		});		
	});
</script>
</head>
<body>
	<fieldset>
		<legend>text() 및 html()함수</legend>
		<button id="read">읽기</button>
		<button id="write">쓰기</button>
		<button id="img">이미지 추가</button>
		<button id="btnText">버튼태그사이의 텍스트 얻기</button>
		<div>
			<h2>제목입니다.</h2>
		</div>
		<div id="display"></div>
	</fieldset>
</body>
</html>