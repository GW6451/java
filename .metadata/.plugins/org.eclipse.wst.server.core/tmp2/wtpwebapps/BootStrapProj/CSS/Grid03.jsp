<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title>Grid03.jsp</title>
    <!-- 부트스트랩 -->
    
    <link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    	.row div{
    		background-color: white;
    		outline: 1px tomato solid;
    	}
    </style>
  </head>
  <body>
    	<div class="page-header">
    		<h1 id = "display_width">해상도</h1>
    	</div>
    	<!-- 고정폭(fixed-width) -->    	 
    	<div class="container-fluid">
    			<h2>컬럼 오프셋하기</h2>
    			<div class="row">
				  	<div class="col-md-4">.col-md-4</div>
				  	<div class="col-md-4 col-md-offset-4">.col-md-4 .col-md-offset-4</div>
				</div>
				<div class="row">
					<div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
					<div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
				</div>
				<div class="row">
				  	<div class="col-md-6 col-md-offset-3">.col-md-6 .col-md-offset-3</div>
				</div>
				<div class="row">
					<div class="col-md-8 col-md-offset-2">응용컨텐츠</div>
				</div>
				
				<h2>컬럼 중첩하기 : 컬럼 안에 행 배치</h2>
				<div class="row">
				  <div class="col-sm-9">
				    Level 1: .col-sm-9
				    <div class="row">
				      <div class="col-xs-8 col-sm-6">
				        Level 2: .col-xs-8 .col-sm-6
				      </div>
				      <div class="col-xs-4 col-sm-6">
				        Level 2: .col-xs-4 .col-sm-6
				      </div>
				    </div>
				  </div>
				</div>
				<h2>컬럼 순서 정하기(push/pull)</h2>
				<div class="row">
				  <div class="col-md-9 col-md-push-3">.col-md-9 .col-md-push-3</div>
				  <div class="col-md-3 col-md-pull-9">.col-md-3 .col-md-pull-9</div>
				</div>
				<h3>첫번째 div 5칸,두번째 div 2칸 배치</h3>
				<div class="row">
				  <div class="col-md-5">.col-md-5</div>
				  <div class="col-md-2">.col-md-2</div>
				</div>
				<h3>응용 : 두번째 div뒤로 첫번째 div배치</h3>
				<div class="row">
					<div class="col-md-5 col-md-push-7">.col-md-5 .col-md-push-7</div>
					<div class="col-md-2">.col-md-2</div>				     	 	
				</div>
				<h3>offset과 push의 차이</h3>
				<!--
					offset : 12칸이 넘으면 들어갈 영역이 모자른 경우 개행된다.
					push : 12칸이 넘으면 들어갈 영역이 모자른 경우 개행되지 않고영역밖으로 밀린다.
					*push와 offset사용시 12칸을 고려하자 안그러면 개행되거나 밀리니까!
				 -->
				<div class="row">
					<div class="col-md-2">.col-md-2</div>
					<div class="col-md-8 col-md-offset-2">.col-md-8 .col-md-offset-2</div>
				</div>
				<div class="row">
					<div class="col-md-2">.col-md-2</div>
					<div class="col-md-8 col-md-push-3">.col-md-8 .col-md-offset-2</div>
				</div>
    	</div>
	
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
    <script>
    	window.onresize = function(){
    		$('#display_width').html(window.innerWidth);
    	}
    </script>
  </body>
</html>