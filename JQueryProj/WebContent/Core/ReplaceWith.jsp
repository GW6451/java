<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReplaceWith.jsp</title>
<style>
	div {
		width: 50px;
		height: 50px;
		border: 1px salmon solid;
		text-align: center;
		line-height: 50px;
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
		$(':button').click(function(){
			if($('div').length != 0){
				//$('div').replaceWith("<button>"+$('div').html()+"</button>");
				$('div').each(function(){
					$(this).replaceWith("<button>"+$(this).html()+"</button>");
				});
			}
			else{
				$('button').each(function(){
					$(this).replaceWith("<div>"+$(this).html()+"</div>");
				});	
			}
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>replaceWith()함수</legend>
		<div>div1</div>
		<div>div2</div>
		<div>div3</div>
		<input type="button" value="확인" />
	</fieldset>
</body>
</html>