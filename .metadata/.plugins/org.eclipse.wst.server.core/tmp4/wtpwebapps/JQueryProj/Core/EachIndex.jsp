<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EachIndex.jsp</title>
<style>
div {
	width: 100px;
	height: 100px;
	text-align: center;
	line-height: 100px;
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
		//index():부모자식 구조 즉 같은 구조 안에서의 인덱스를 의미, 인덱스는 0부터 시작.
		var clickDiv = $('div').click(function(){
			//부모자식 구조로 인덱스 부여됨 : 0번은 legend,DIV1이 1번
			//DIV5는 인덱스가 1(FIELDSET이 0)
			console.log('클릭한 div의 인덱스:',$(this).index());
		});
		console.log(clickDiv.length);
		console.log(clickDiv.html());//무조건 첫번째
		console.log($('div').length);
		console.log($('div').html());
		console.log('=================clickDiv=================')
		clickDiv.each(function(index){
			console.log('인덱스:',index);
			console.log($(this).html());
		});
		console.log('=================clickDiv=================')
		$('div').each(function(index){
			console.log('인덱스:',index);
			console.log($(this).html());
		});
		var colors = ['pink','lightyellow','skyblue','lightgreen','lightsalmon'];
		
		//$('div').attr({id:'DIV' ,style:'background-color:'+colors[0]});
		
		$('div').each(function(i){
			$(this).attr({id:'DIV'+i,style:'background-color:'+colors[i]})
		});
		//동적으로 부여된 아이디값으로 객체 선택]
		console.log('css()함수 :',$('#DIV1').css('backgroudColor'));
		console.log('prop()함수:' ,$('#DIV1').prop('style'));
		console.log('attr()함수:' ,$('#DIV1').attr('style'));
		//[모든 DIV에 each를 걸어 오버시 노란색 아웃시 해당 DIV의 원래 배경색으로 ]
		$('div').each(function(){
			//원래 배경색 얻기
			var bgColor = $(this).css('backgroundColor');
			$(this).hover(function(){
				$(this).css('backgroundColor','yellow');
			},function(){
				$(this).css('backgroundColor',bgColor);
			});
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>each()함수 및 index()함수</legend>
		<div>DIV1</div>
		<div>DIV2</div>
		<div>DIV3</div>
		<div>DIV4</div>
	</fieldset>
	<div>DIV5</div>
</body>
</html>