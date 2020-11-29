<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clone.jsp</title>
<style>
.clone {
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function() {
		$('div:eq(0)').click(function(){//원본 div클릭시
			//$('div:eq(1)').after($(this).css('backgroundColor','lightsalmon').html('복제'));
			$('div:eq(1)').after($(this).clone().css('backgroundColor','lightsalmon').html('복제'));
		});
		//설문지 문항을 동적으로 추가하기
		var index=1;
		$(':button').click(function(){
			//$('div:last').after($('div:last').clone().find('span').html('문제'+ ++index+'번').end().find(':text').prop('name','problem'+index).end());
			$('div:last').after('<div><span>문제'+index+'번</span><input type="text" name="problem'+index+'" style="width: 60%" /></div>');
	});
</script>
</head>
<body>
	<fieldset>
		<legend>clone()</legend>
		<div class="clone">원본</div>
		<div class="clone">대상</div>
		<hr />
		<button>문제 추가</button>
		<hr />
		<div>
			<span>문제1번</span><input type="text" name="problem1" style="width: 60%" />
		</div>
		​ ​
	</fieldset>
</body>
</html>