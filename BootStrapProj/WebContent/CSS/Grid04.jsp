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
    <title>Grid04.jsp</title>

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
    		<h2>반응형 유틸리티 : visible-*-*</h2>
    		<h3>행에 적용하기</h3>
			<hr/>
			<h5>visible-*-* 미적용</h5>
			<div class="row">
				<div class="col-xs-4">.col-xs-4</div>
				<div class="col-xs-4">.col-xs-4</div>
				<div class="col-xs-4">.col-xs-4</div>
			</div>
			
			<h5>visible-*-* 적용</h5>
			<div class="row visible-md-block visible-sm-block">
				<div class="col-xs-4">.col-xs-4</div>
				<div class="col-xs-4">.col-xs-4</div>
				<div class="col-xs-4">.col-xs-4</div>
			</div>
			<h3>컬럼에 적용하기</h3>
			<div class="row ">
				<div class="col-md-4">컨텐츠1</div>
				<div class="col-md-4 visible-md">컨텐츠2</div>
				<div class="col-md-4">컨텐츠3</div>
			</div>
			<h1>반응형 컬럼 초기화 하기</h1>
			<div class="row">
				<div class="col-xs-6 col-sm-3">컬럼1</div>
				<div class="col-xs-6 col-sm-3">컬럼2</div>
				<div class="col-xs-6 col-sm-3">컬럼3</div>
				<div class="col-xs-6 col-sm-3">컬럼4</div>
			</div>
			<h3>clearfix와 반응형 유틸리티 조합 전</h3>
			<div class="row">
				<div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3
							Resize your viewport or check it out on your phone for an example.</div>
				<div class="col-xs-6 col-sm-3">컬럼2</div>
				<div class="col-xs-6 col-sm-3">컬럼3</div>
				<div class="col-xs-6 col-sm-3">컬럼4</div>
			</div>
			<h3>clearfix와 반응형 유틸리티 조합 후</h3>
			<div class="row">
				<div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3
							Resize your viewport or check it out on your phone for an example.</div>
				<div class="col-xs-6 col-sm-3">컬럼2</div>
				
				<div class="clearfix visible-xs-block"></div>
				<div class="col-xs-6 col-sm-3">컬럼3</div>
				<div class="col-xs-6 col-sm-3">컬럼4</div>
			</div>
			<h3>응용문제</h3>
			<div class="row">
				<div class="col-md-8 col-md-offset-4">컨텐츠1
					<div class="col-md-4 col-md-offset-4" style="background-color: salmon">컨텐츠2</div>
				</div>
				
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