<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DatePicker.jsp</title>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<!-- 제이쿼리 core -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!--  
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
-->
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<!-- 제이쿼리 UI용 라이브러리 임베드 -->

<script>
	$(function(){
		//Datepicker위젯 생성 방법은 
		//1]Datepicker위젯 생성시 {}로 함수의 인자로 처음부터 주거나
		//$('#datepicker').datepicker({dateFormat:"yy-mm-dd"});
		//2]datepicker()함수로 Datepicker위젯 생성 후에 setter로 설정
		//$('#datepicker').datepicker();
		//세터:옵션 설정
		//$('#datepicker').datepicker("option","dateFormat","yy-mm-dd");
		//console.log("설정된 옵션 게터로 읽기 : ",$('#datepicker').datepicker("option","dateFormat"));
		
		var today= new Date();
		$('#datepicker').datepicker({
			showAnim:'bounce',
			dateFormat:"yy-mm-dd",
			minDate:new Date(today.getFullYear(),today.getMonth(),today.getDate()),
			buttonText:"달력",
			buttonImage: "<c:url value='/Images/calender.png'/>",
			showOn:'both',
			buttonImageOnly:true,
			onSelect:function(dateText,inst){
				//console.log('사용자가 선택한 날짜 : ',dataText);
				$('#display').html(dateText);
				console.log('%O',inst);
				var currentDate = $("#datepicker").datepicker("getDate");
				console.log('데이트피커 객체의 getDate()호출:',currentDate);
			}
		});
		//제이쿼리로 달력이미지의  css설정 : 방법1
		$('.ui-datepicker-trigger').css({width:'35px',height:'35px',"vertical-align":'middle'});	
	});
</script>
<!-- style태그로 직접 달력이미지의 css 설정:방법2 -->
<style>
	/*
	.ui-datepicker-trigger{
		width : 35px;
		height : 35px;
		vertical-align:middle;
	}
	*/
</style>
</head>
<body>
	<fieldset>
		<legend>데이트 피커</legend>
		<input type="text" id="datepicker"/>
		<h2>선택한 날짜 아래에 표시하기</h2>
		<span id="display" style="color:red;font-size:1.5em"></span>
	</fieldset>
</body>
</html>