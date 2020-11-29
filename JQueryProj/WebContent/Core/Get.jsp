<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
<!-- jquery 사용을 위한 라이브러리 임배딩. 직접 임베디드하거나, cdn이용해서 받아도됨
1. 다운받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
-->
<!-- 2. cdn사용해서 주소 사용해도됨 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		//1. $()로 jquery dom객체 얻는다. 
		var jQueryDom = $('#naver'); 
		//2. 자바스크립트로 dom객체를 얻었을때는 jquery함수 적용 불가능하다
		var jsDom = document.querySelector('#naver');
		console.log("jqueydom:"+jQueryDom);
		console.log('jquerydom:%o',jQueryDom);
		console.log("jsdom:"+jsDom);
		//jQueryDom.css('color','red').html('NAVER');
		jsDom.style.color='red';
		jsDom.innerHTML='NAVER';
		//3. JQUERY함수로 브라우저 DOM객체얻기
		//get(인덱스) : 제이쿼리 돔객체를 자바스크립트 돔객체로 변환해준다. 인덱스는 선택된 jquery dom객체중 인덱스값을 주며 0부터 시작한다
		console.log($('#naver').href) ; //undefined나온다. 제이쿼리돔객체에 브라우저 dom함수를 넣었기때문에
		console.log($('#naver').get(0).href); //뭐..아이디값은 하나밖에없으니 0번째를 가져온다음 브라우저dom의 함수인 href를 넣어도 이제 적용이된다
		$('input[type=button]:first').click(function(){
			//1) 자스이용
			console.log('자바스크립트사용:'+document.getElementById("txt").value);
			//2) 제이쿼리사용
			console.log('제이쿼리사용:', $('#txt').get(0).value);
			console.log('제이쿼리사용:', $('#txt').val());
		})
		$('input[type=button]:last').click(function(){
			//1. 자스버젼
			var val = document.getElementsByTagName('span')[0];
			val.style.color='red';
			val.style.fontSize='1.8em';
			//2. 제이쿼리버젼 (따로따로 할것)
			$('span').css('color','red').css('fontSize','1.8em');
		})
		//3.완전한자스버젼
		//각각받은후 onclick / addEventListener()를 이용해서 작성한다
		document.getElementsByTagName('input')[2].addEventListener('click',function(){
		    document.getElementsByTagName('span')[0].style.color='red';
		    document.getElementsByTagName('span')[0].style.fontSize = '1.8em';
		 })
	})
</script>
</head>
<body>
	<fieldset>
		<legend>get(인덱스)함수 get을통해가지면 윈도우객체로 가져오고 jquery돔객체가 아니기때문에.. jquery함수가 안먹힐것이다.</legend>
		<input type="text" value="텍스트값" id="txt" /> <input type="button"
			value="확인" />
		<ul style="list-style-type: decimal;">
			<li><a href="http://www.naver.com" id="naver">네이버</a></li>
			<li><a href="http://www.daum.net">다음</a></li>
			<li><a href="http://www.nate.com">네이트</a></li>
		</ul>
		<h2>실습하기</h2>
		<span>실습입니다</span> <input type='button' value="텍스트변경하기" />
	</fieldset>
</body>
</html>