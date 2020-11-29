<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attr.jsp</title>
<style>
	.bg{
		background-color: salmon;
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
		$('#add').click(function(){
			/*
			//attr()함수사용]
			//메소드 체인]
			$('#div').attr('title','여기를 클릭하세요').
			attr('class','bg').
			attr('style','width:100px;height:100px;text-align:center;line-height:100px').
			on('click',function(){
				$(this).html('JQUERY');
			});
			*/
			//JSON
			/*
			$('#div').attr({'title':'Click Here','class':'bg','style':'width:100px;height:100px;text-align:center;line-height:100px'}).
				on('click',function(){
					$(this).html('JQUERY');
			});
			*/
			/*
			$('#div').
			prop('title','여기를 클릭하세요').
			prop('class','bg').
			prop('style','width:100px;height:100px;text-align:center;line-height:100px').
			on('click',function(){
				$(this).html('JQUERY');
			});
			*/
			$('#div').attr({'title':'Click Here','class':'bg','style':'width:100px;height:100px;text-align:center;line-height:100px'}).
			on('click',function(){
				$(this).html('JQUERY');
			});
			$('#read').click(function(){
				console.log('checkbox의 checked속성(attr) : ',$(':checkbox').attr('checked'));//undefined
				console.log('checkbox의 checked속성(prop) : ',$(':checkbox').prop('checked'));//true
				console.log('a의 href속성(attr) : ',$('#atag').attr('href'));//#
				console.log('a의 href속성(prop) : ',$('#atag').prop('href'));// http://localhost:8080/JQueryProj/Core/Attr.jsp#
				
				console.log('div의 class속성(attr) : ',$('#div').attr('class'));//bg
				console.log('div의 class속성(prop) : ',$('#div').prop('class'));//bg
				
				console.log('div의 class속성(get()):',$('#div').get(0).class);//undefined
			});
			$('#remove').click(function(){
				//$('#div').removeAttr('class').removeAttr('style');
				$('#div').removeProp('class').removeProp('style');///제거 안됨
			});
			$('button:gt(2)').click(function(){
				$('img').attr('src','<c:url value="/Images/'+this.id+'.jpg"/>');
			});
			$('a:eq(0)').click(function(){
				console.log('표기하지 않은 속성href(attr):',$(this).attr('href'));//undefined
				console.log('표기하지 않은 속성href(prop):',$(this).prop('href'));
				console.log('표기하지 않은 속성href(get(0).href):',$(this).get(0).href);
				console.log('표기하지 않은 속성href(this):',this.href);
			});
			//value속성이 없는 type=text의 값 읽어오기:무조건 val()
			$('button').click(function(){
				console.log('attr():',$(':text').attr('value'));
				console.log('prop():',$(':text').prop('value'));
				console.log('val():',$(':text').val());
			});
			//동적으로 체크박스 체크하기
			$('#chkbtn').click(function(){
				//$(':checkbox').attr('checked','checked');
				$(':checkbox').prop('checked','checked');
			});
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>attr()함수 및 removeAttr(),prop()함수</legend>
		<button id="add">속성추가</button>
		<button id="read">속성읽기</button>
		<button id="remove">속성제거</button>
		<div id="div">DIV태그</div>
		<button id="1">1번 이미지</button>
		<button id="2">2번 이미지</button>
		<button id="3">3번 이미지</button>
		<button id="4">4번 이미지</button>
		<br /> <img src="#" alt="이미지" /><br />
		<a>href속성을 미 지정한 A태그</a>
		<br /> ​ <input value="확인" type="button" id="button" /> <input
			type="text" size="30" />
		<hr />
		<input type='checkbox' />체크박스
		<a href="#" id="atag">A태그</a>
		<input type="button" id="chkbtn" value="attr및 prop으로 체크 설정하기" />
	</fieldset>
</body>
</html>