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
    <title>ScrollSpy.jsp</title>

    <!-- 부트스트랩 -->
    
    <link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
       body{
          padding-top:50px
       }
       .scrollspy-content {
          height:100px;
          background-color:yellow;
         overflow:auto;
         position:relative;
       }
    </style>
  </head>
  <body>
     <nav id="navbar" class="navbar navbar-default"> <!-- 상단 메뉴 시작 -->
        <div class="container-fluid">
           <!-- 화면 크기가 작을 때 보여지는 네비게이션바(모바일용) -->
           <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapse-menu">
                 <span class="icon-bar"></span>
                 <span class="icon-bar"></span>
                 <span class="icon-bar"></span>
             </button>
            <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-education"></span> KOSMO</a>
          </div>
          
          <!-- 화면 크기가 클 때 보여지는 네비게이션바(데스크탑) -->
          <div class="collapse navbar-collapse" id="collapse-menu">
             <!-- 네비게이션바에 폼 추가 -->
              <form class="navbar-form navbar-right ">
               <ul class="nav navbar-nav navbar-right">
               <!-- 아래 컨텐츠 href에 내용의 id값 지정 -->
               <li><a href="#menu1">메뉴1</a></li>
               <li><a href="#menu2">메뉴2</a></li>
               <li><a href="#menu3">메뉴3</a></li>
            </ul>
            <div class="form-group">
               <input type="text" class="form-control" placeholder="검색">
            </div>
              <button type="submit" class="btn btn-info">확인</button>              
            </form>     
               
               
          </div>
        </div>
     </nav> <!-- 상단메뉴 끝 -->
 
       
       <div class="scrollspy-content" data-spy="scroll" data-target="#navbar">
          <h4 id="menu1">메뉴1 소개글</h4>
          <p>@fat
         Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr enim lo-fi before they sold out qui. 
         Tumblr farm-to-table bicycle rights whatever. Anim keffiyeh carles cardigan. 
         Velit seitan mcsweeney's photo booth 3 wolf moon irure. Cosby sweater lomo jean shorts, 
         williamsburg hoodie minim qui you probably haven't heard of them et cardigan trust fund culpa biodiesel wes anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh artisan ullamco consequat.</p>
       
       <h4 id="menu2">메뉴2 소개글</h4>
          <p>@fat
         @mdo
Veniam marfa mustache skateboard, adipisicing fugiat velit pitchfork beard. Freegan beard aliqua cupidatat mcsweeney's vero. Cupidatat four loko nisi, ea helvetica nulla carles. Tattooed cosby sweater food truck, mcsweeney's quis non freegan vinyl. Lo-fi wes anderson +1 sartorial. Carles non aesthetic exercitation quis gentrify. Brooklyn adipisicing craft beer vice keytar deserunt.</p>
       
       <h4 id="menu3">메뉴3 소개글</h4>
          <p>
Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr enim lo-fi before they sold out qui. Tumblr farm-to-table bicycle rights whatever. Anim keffiyeh carles cardigan. Velit seitan mcsweeney's photo booth 3 wolf moon irure. Cosby sweater lomo jean shorts, williamsburg hoodie minim qui you probably haven't heard of them et cardigan trust fund culpa biodiesel wes anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh artisan ullamco consequat.</p>
       </div>
    </div>
   
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
  </body>
</html>