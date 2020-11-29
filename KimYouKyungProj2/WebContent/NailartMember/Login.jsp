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
<script src="https://developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type="text/javascript">
	window.onload = function(){
		Kakao.init('70aa8e88ce9bd15943b116fcee21da16');
	};
</script>
<title>Login.jsp</title>

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
		<div class="jumbotron"
			style="background: linear-gradient(45deg, pink, mistyrose)">
			<h1 style="text-align: center; color: white; font-weight: bold">로그인</h1>
		</div>
	</div>
	<!-- 실제 내용 시작 -->
	<div class="col-xs-10 col-xs-offset-1 col-md-2 col-md-offset-5">
		<div class="row">
			<form class="form-horizontal" method="post"
				action="<c:url value="/NailartMember/LoginPage.kosmo"/>">
				<div class="form-group">

					<input type="text" class="form-control" name="id" id="id"
						placeholder="아이디">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="password"
						id="password" placeholder="비밀번호">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-block"
						style="background-color: pink; color: white">로그인</button>
				</div>
				<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
					<h1></h1>
					<hr/>
				</div>
				<div class="form-group" style="text-align: center">
					<a id="custom-login-btn" href="javascript:loginWithKakao()">
						<img
							src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg"
							width="200" />
					</a>
					<p id="token-result"></p>
				</div>

			</form>
		</div>
	</div>
	<!-- 실제 내용 끝 -->
	<!-- 푸터 시작 -->
	<jsp:include page="/Template/NailartFooter.jsp" />
	<!-- 푸터 끝 -->	
	<script type="text/javascript">
	  function loginWithKakao() {
	    Kakao.Auth.authorize({
	    	redirectUri: 'http://localhost:7070/KimYouKyungProj2/NailartMember/LoginPage.kosmo'
		});
	  }
	  displayToken()
	  function displayToken() {
	    const token = getCookie('authorize-access-token')
	    if(token) {
	      Kakao.Auth.setAccessToken(token)
	      Kakao.Auth.getStatusInfo(({ status }) => {
	        if(status === 'connected') {
	          document.getElementById('token-result').innerText = 'login success. token: ' + rAFbxkjfPqe77f6eZBjYZBy08GOkjTiHu680Rgo9dRkAAAF2DlFfmg
	        } else {
	          Kakao.Auth.setAccessToken(null)
	        }
	      })
	    }
	  }
	  function getCookie(name) {
	    const value = "; " + document.cookie;
	    const parts = value.split("; " + name + "=");
	    if (parts.length === 2) return parts.pop().split(";").shift();
	  }
	</script>


</body>
</html>