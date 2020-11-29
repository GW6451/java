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
    <title>Form.jsp</title>

    <!-- 부트스트랩 -->
    
    <link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <div class="container">
    	<div class="page-header">
    		<h1>폼<small> 폼연습하기</small></h1>
    	</div>
    	<div class="row">
    		<div class="col-md-offset-1 col-md-10">
    			
    			<form>
				  <div class="form-group">
				    <label for="email">이메일 주소</label>
				    <input type="email" class="form-control" id="email" placeholder="이메일을 입력하세요">
				  </div>
				  <div class="form-group">
				    <label for="password">암호</label>
				    <input type="password" class="form-control" id="password" placeholder="암호">
				  </div>
				  <div class="form-group">
				    <label>파일 업로드</label>
				    <input type="file" class="form-control">
				    <p class="help-block">여기에 블록레벨 도움말 예제</p>
				  </div>
				  <div class="checkbox">
				    <label>
				      <input type="checkbox"> 아이디 저장
				    </label>
				  </div>
				  <div class="form-group">
				  <button type="submit" class="btn btn-success" >제출</button>
				  </div>
				</form>
    		</div>    		
    	</div>
    	<!-- row -->
    	<h2>인라인 폼</h2>
         <div class="row">
            <div class="col-md-offset-1 col-md-1">
               <form class="form-inline">
                  <div class="form-group">
                     <label>이름</label>
                     <input type="text" class="form-control">
                  </div>
                  <div class="form-group">
                     <label>비밀번호</label>
                     <input type="password" class="form-control">
                  </div>
                  <div class="form-group">
                     <label>이메일</label>
                     <input type="email" class="form-control">
                  </div>
                  <div class="form-group">
                     <button type="submit" class="btn btn-default">확인</button>
                  </div>
               </form>
            </div>
         </div>
         <!-- 수평 폼 -->
         <div class="row">
         	<div class="col-md-offset-1 col-md-10">
         		<form class="form-horizontal">
         			<div class="form-group">
         				<label class="col-sm-2 control-label">이메일 주소</label>
         				<div class="col-sm-4">
         					<input type="email" class="form-control">
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">암호</label>
         				<div class="col-sm-4">
         					<input type="pass" class="form-control">
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">제목</label>
         				<div class="col-sm-8">
         					<input type="title" class="form-control">
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2">파일 업로드</label>
         				<div class="col-sm-8">
         					<input type="file"/>
         					<p class="help-block">이미지 파일만 업로드 하세요</p>
         				</div>         				
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">성별</label>
         				<div class="col-sm-4">
         					<!-- 가로배치 -->
         					 
         					<div class="radio">
         						<label><input type="radio" name="a"/>남자</label>
         						<label><input type="radio" name="a"/>여자</label>
         						<label><input type="radio" name="a" class="disabled" disabled/>젠더</label>
         					</div>
         					
         					 <!--
         					 <div class="radio">
         						<label><input type="radio" />남자</label>
         					</div>
         					<div class="radio">
         						<label><input type="radio" />여자</label>
         					</div>
         					<div class="radio">
         						<label><input type="radio" class="disabled" disabled/>젠더</label>
         					</div>
         					 -->
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">관심사항</label>
         				<div class="col-sm-4">
         					<div class="checkbox">
         						<label><input type="checkbox" />정치</label>
         						<label><input type="checkbox" />경제</label>
         						<label><input type="checkbox" />연예</label>
         					</div>
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">학력</label>
         				<div class="col-sm-3">
         					<select class="form-control input-sm">
         						<option>학력을 선택하세요</option>
         						<option>초등학교</option>
         						<option>중학교</option>
         						<option>고등학교</option>
         						<option>대학교</option>
         					</select>
         				</div>
         			</div>
         			<div class="form-group">
         				<label class="col-sm-2 control-label">자기소개</label>
         				<!-- 중첩 컬럼 사용 -->
         				<div class="col-sm-10">
         					<div class="row">
         						<div class="col-sm-8">
         							<textarea rows="5" class="form-control"></textarea>
         						</div>
         					</div>       					
         				</div>
         			</div>
         			<div class="form-group">         				
         				<div class="checkbox">
         					<label class="col-sm-offset-2 col-sm-4">아이디 저장</label>
         				</div>
         			</div>
         			<div class="form-group">         				
         				<div class="col-sm-offset-2 col-sm-4">
         					<button class="btn btn-primary">확인</button>
         				</div>
         			</div>
         		</form>
         	</div>
         </div>
    </div>

    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
  </body>
</html>