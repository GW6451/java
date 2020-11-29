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
<title>Join.jsp</title>

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
		<div class="jumbotron" style="background: linear-gradient(45deg,pink,mistyrose)">
			<h1 style="text-align: center; color: white; font-style: bold">회원가입</h1>
		</div>
	</div>
		<form class="form-horizontal" method="post">
		<!-- 실제 내용 시작 -->
		<div class="col-xs-10 col-xs-offset-1 col-md-4 col-md-offset-4">
			<table class="table">
				<tr>
					<td><label for="id" style="color:palevioletred">아이디</label></td>
					<td><input type="text" class="form-control" name="id" id="id" placeholder="아이디"></td>
				</tr>
				<tr>
					<td><label for="pwd" style="color:palevioletred">비밀번호</label></td>
					<td><input type="password" class="form-control" name="pwd" id="pwd" placeholder="비밀번호"></td>
				</tr>
				<tr>
					<td><label for="name" style="color:palevioletred">이름</label></td>
					<td><input type="text" class="form-control" name="name" id="name" placeholder="이름"></td>
				</tr>
				<tr>
					<td><label for="age" style="color:palevioletred">나이</label></td>
					<td><input type="text" class="form-control" name="age" id="age" placeholder="나이"></td>
				</tr>
				<tr>
					<td><label for="gender" style="color:palevioletred">성별</label></td>
					<td>
						<input type="radio" name="gender" value="남성"/><span style="color:palevioletred"> 남자</span>
						<input type="radio" name="gender" value="여성"/><span style="color:palevioletred"> 여자</span>	
					</td>
				</tr>
				<tr>
					<td><label for="tel" style="color:palevioletred">휴대폰번호</label></td>
					<td><input type="text" class="form-control" name="tel" id="tel" placeholder="휴대폰번호"></td>
				</tr>
				<tr>
					<td><label for="addr" style="color:palevioletred">주소</label></td>
					<td><input type="text" class="form-control" name="addr" id="addr" placeholder="주소"></td>
				</tr>				
				<tr>
					<td><label for="email" style="color:palevioletred">이메일</label></td>
					<td><input type="email" class="form-control" name="email" id="email" placeholder="이메일"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center">			
						<button type="submit" class="btn" style="background-color: pink;color: white">가입</button>
					</td>
				</tr>				
			</table>
			<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
				<h1></h1>
			</div>
			<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
				<h1></h1>
			</div>
			<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
				<h1></h1>
			</div>
		</div>
		</form>
	<!-- 실제 내용 끝 -->
	<!-- 푸터 시작 -->
	<jsp:include page="/Template/NailartFooter.jsp" />
	<!-- 푸터 끝 -->


</body>
</html>