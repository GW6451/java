<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
<title>MainPage.jsp</title>

<!-- 부트스트랩 -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body style="background-color: lavenderblush">
	<!-- 네비게이션바 시작 -->
	<jsp:include page="/Template/NailartTop.jsp" />
	<!-- 네비게이션바 끝 -->
	<!-- 실제 내용 시작 -->
	<div class="row">
		<div class="col-xs-12 col-md-12" style="text-align: center">
			<h2 style="color: deeppink">${MainPage}</h2>
		</div>
		
		<!-- 네일 디자인 소개 -->
		<div class="col-xs-12 col-md-12">
			<h4 style="color: deeppink">&nbsp;&nbsp;★이 달의 네일디자인★</h4>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/bigheart.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>큰 하트 네일</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/galaxy.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>우주네일</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/bigpearl.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>큰 진주 네일</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/redheart.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>빨간하트</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/middlepearl.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>작은진주네일</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-2">
			<div class="thumbnail">
				<img src="<c:url value="/Images/silver.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>실버글리터</h3>
					<p>내일은 nail샵입니다~</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<!-- ------------------------------------------------------------------------------- -->
		<!-- 네일샵 소개 -->
		<div class="col-xs-12 col-md-12">
			<h4 style="color: deeppink">&nbsp;&nbsp;★이 달의 네일샵★</h4>
		</div>
		<div class="col-xs-6 col-md-3">
			<div class="thumbnail">
				<img src="<c:url value="/Images/bitnalhee.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>빛날희</h3>
					<p>빛날희 네일샵</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-3">
			<div class="thumbnail">
				<img src="<c:url value="/Images/mari.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>마리</h3>
					<p>마리 네일샵</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-3">
			<div class="thumbnail">
				<img src="<c:url value="/Images/nailing.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>네일ing</h3>
					<p>네일ing 네일샵</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-xs-6 col-md-3">
			<div class="thumbnail">
				<img src="<c:url value="/Images/goldennail.jpg"/>"
					style="width: 100%; height: 100%">
				<div class="caption">
					<h3>골든네일</h3>
					<p>골든네일 네일샵</p>
					<p>
						<a href="#" class="btn btn-info" role="button">예약하기</a>
					</p>
				</div>
			</div>
		</div>

	</div>
	<!-- 실제 내용 끝 -->
	<!-- 푸터 시작 -->
	<jsp:include page="/Template/NailartFooter.jsp" />
	<!-- 푸터 끝 -->


</body>
</html>