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
		//자식태그로 존재하는 div중 첫번째 div태그
		console.log('div:first-child의 innerhtml : ',$('div:first-child').html());
		//div태그중 첫번째 div태그
		console.log('div:first의 innerhtml :', $('div:first').html());
		console.log('div:eq(0)의 innerhtml :', $('div:eq(0)').html());
		console.log('마지막 자식인 div의 갯수 : ', $('div:last-child').length); //fieldset의 마지막자식, div안의 마지막자식 해서 총 2개가 나오게된다
		console.log('div:last-child 에 html()함수적용 :', $('div:last-child').html()) //근데 총 2개인데 두개의 div중 첫번째 div에만 적용되서 나타난다. 모든객체에 적용하고싶으면 each()
		//click같은거면 도든 선택된 값에 다 이벤트가 걸리는데..
		//.html()처럼 상태값을 읽어오는건.... each()를 해야 모두 읽어올수있다
		$('div:last-child').each(function(){
			console.log($(this).html()) //이 함수가 적용되는 div라는 의미의 this.. 즉 클릭한, 실행해야할 해당 선택자가 있는곳이 this이다
		});
		//click이벤트는 빈번해서 이미 함수가 선언되어있음
//		$('button').click(function (){
//			$(this).html('<strong>'+$(this).html()+'버튼이 클릭되었습니다</strong>');
//		});
		//위에거랑 똑같음..
		$('button').bind('click', function(){
			$(this).html('<strong>'+$(this).html()+'버튼이 클릭되었습니다</strong>');
		})
		//bind..!
//		$('div:eq(1) > div').bind('mouseover', function(){}).bind('mouseout', function(){});
		$('div:eq(1) > div').bind('mouseover', function(){
			$(this).css({'backgroundColor': 'black', 'color':'white'});
		}).bind('mouseout', function(){
			$(this).css({'backgroundColor' : 'white', 'color':'black'});
		});
		console.log($('div:eq(2)').html()); //0은 div1, 1은 밑에 네이버/다음/네이트를 감싸는 div, 2가 바로 네이버 이다.
		//그냥 this.는 그냥 윈도우객체에서 사용한.... $(this)는 이벤트가 발생한객체 또는 jqeuy dom 객체
		$('div:eq(1) div').bind('click', function(){
			//console.log('$(this).title :',$(this).title); //이렇게만 쓰면 undefined나옴..^^.. jquery 객체에는 title이 없어서 get써야함
			console.log('$(this).title :',$(this).get(0).title);
			console.log('this.title:', this.title);
			switch(this.id){
				case 'naver' :
					location.href='https://www.naver.com'; break;
				case 'daum' :
					location.href='https://www.daum.net'; break;
				default : 
					location.href='https://www.nate.com';					
			}
		})
		//이벤트바인딩
		$('div:last h2').bind('click', function(){
			console.log($(this).html());
		})
		//이벤트해제
		//bind()메소드로 바인딩한건 unbind("해체할 이벤트명") 메소드로 언바인딩하여 이벤트해체한다
		$('input[type=button]').click(function(){
			$('div:last h2').unbind('click');
		})
	})
</script>
</head>
<body>
	<fieldset>
		<legend>bind("이벤트명",콜백함수)</legend>
		<div>div1</div>
		<button>클릭1</button>
		<button>클릭2</button>
		<button>클릭3</button>
		<div>
			<div id="naver" title="네이버">네이버</div>
			<div id="daum" title="다음">다음</div>
			<div id="nate" title="네이트">네이트</div>
		</div>
		<div>
			<h2 style="background-color: red">unbind테스트</h2>
			<input type="button" value="이벤트해제" />
		</div>
	</fieldset>
</body>
</html>