<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	body{ padding-top:70px}
</style>
<!--상단메뉴 시작-->
<nav class="navbar navbar-default navbar-fixed-top" style="background: linear-gradient( to right , #faaca8,#ddd6f3)">
	<div class="container-fluid">
		<!--화면 크기가 작을때 보여지는 네비게이션바(모바일용)  -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" style="background-color: white"
				data-toggle="collapse" data-target="#collapse-menu">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href='<c:url value="/MainPage.kosmo"/>'>
			<span style="color: white"><img src="<c:url value="/Images/nail-polish.png"/>" style="width: 25px;height: 25px"> 내일도 Nail</span>
			</a>
		</div>
		<!-- 화면 크기가 클때 상단에 보여지는 메뉴(데스크탑용) -->
		<div class="collapse navbar-collapse" id="collapse-menu">
			<!-- 네비게이션바에 폼 추가 -->
			<form class="navbar-form navbar-right">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="검색">
				</div>
				<button type="button" class="btn" id="btn" style="background-color: white">
					<img class="btn-img" src='<c:url value="/Images/search.png"/>' style="width:25px; height: 25px"/>
				</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href='<c:url value="/MainPage.kosmo"/>'><span style="color: white">HOME</span></a></li>
				<c:if test="${empty sessionScope.id}" var="isNotLogin">
				<li><a href="<c:url value="/NailartMember/LoginPage.kosmo"/>"><span style="color: white">LOGIN</span></a></li>
				</c:if>
				<c:if test="${!isNotLogin}">
				<li><a href="<c:url value="/NailartMember/LogoutPage.kosmo"/>"><span style="color: white">LOGOUT</span></a></li>
				</c:if>
				<c:if test="${empty sessionScope.id}" var="isNotLogin">
				<li><a href="<c:url value="/NailartMember/JoinPage.kosmo"/>"><span style="color: white">JOIN</span></a></li>
				</c:if>
				<c:if test="${!isNotLogin}"></c:if>
				<li><a href='<c:url value="/NailartMember/MyPage.kosmo"/>'><span style="color: white">MYPAGE</span></a></li>
				<li><a href='<c:url value="/Nailart/Gallery.kosmo"/>'><span style="color: white">GALLERY</span></a></li>
			</ul>
		</div>
	</div>
</nav>
<!--  상단 메뉴 끝 -->