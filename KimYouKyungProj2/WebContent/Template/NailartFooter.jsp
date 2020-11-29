<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
<hr/>
<nav class="navbar navbar-default navbar-fixed-bottom" style="background: linear-gradient( to right, palevioletred,pink)">
	<div class="container-fluid">
		<!--화면 크기가 작을때 보여지는 네비게이션바(모바일용)  -->
		<div class="navbar-header">
			<p style="color: white"> 상업명 : 내일도 nail(주)<br/>
				사무실 : 02-0000-0000<br/>
				주소 : 서울시 가산동
			</p>
		</div>
		<!-- 화면 크기가 클때 상단에 보여지는 메뉴(데스크탑용) -->
		<div class="collapse navbar-collapse" id="collapse-menu">
			<!-- 네비게이션바에 폼 추가 -->
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="검색">
				</div>
				<button type="submit" class="btn" style="background-color: pink;color: white">확인</button>
			</form>
		</div>
	</div>
</nav>	
	
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
