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
<title>Gallery.jsp</title>

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
	<div class="container">
		<!-- 점보트론(Jumbotron) -->
		<div class="jumbotron" style="background: linear-gradient(45deg, pink, mistyrose); width:100%; margin: auto">
			<h1 style="text-align: center; color: white; font-style: bold">GALLERY</h1>
		</div>
		<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
			<h1></h1>
		</div>
	</div>
	<!-- 실제 내용 시작 -->
	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
			<div class="col-xs-1 col-md-1 col-xs-offset-9 col-md-offset-11">
				<a href="/Nailart/GalleryWrite.kosmo" class="btn" role="button" style="background-color: pink; color: white; margin-right: auto">글작성</a>
			</div>
			<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
				<h1></h1>
			</div>
			<table class="table table-bordered" style="margin:auto">
				<tr>
					<th class="col-xs-1 col-md-1 text-center"><label for="no" style="color:palevioletred">no</label></th>
					<th class="col-xs-6 col-md-7 text-center"><label for="title" style="color:palevioletred">제 목</label></th>
					<th class="col-xs-2 col-md-3 text-center"><label for="id" style="color:palevioletred">작성자</label></th>
					<th class="col-xs-1 col-md-2 text-center"><label for="likecount" style="color:palevioletred"><span class="glyphicon glyphicon-thumbs-up"></span></label></th>					
				</tr>
				<c:if test="${empty list }" var="isEmpty">
						<tr>
							<td colspan="4" style="text-align: center;color: gray">등록된 게시물이 없습니다.</td>
						</tr>
				</c:if>
				<c:if test="${!isEmpty}">
					<c:forEach var="item" items="${list}" varStatus="loop">
						<tr>
							<th class="col-xs-1 col-md-1 text-center" style="color:palevioletred">${item.no}</th>
							<th class="col-xs-6 col-md-7 text-center" style="color:palevioletred"><a href="<c:url value='/Nailart/GalleryView.kosmo?no=${item.no}'/>">${item.title}</a></th>
							<th class="col-xs-2 col-md-3 text-center" style="color:palevioletred">${item.id}</th>
							<th class="col-xs-1 col-md-2 text-center" style="color:palevioletred">${item.likecount}</th>					
						</tr>
					</c:forEach>
				</c:if>
			</table>
			<div class="row">
				<div class="col-md-12">&nbsp;</div>
			</div>
		</div>
	</div>
	<!-- 실제 내용 끝 -->
	<!-- 푸터 시작 -->
	<jsp:include page="/Template/NailartFooter.jsp" />
	<!-- 푸터 끝 -->


</body>
</html>