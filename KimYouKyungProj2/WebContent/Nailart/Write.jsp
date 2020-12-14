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
<title>Write.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
<!-- 부트스트랩 -->
<script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			url: "<c:url value='/Nailart/PrevImg.kosmo'/>",
			dataType: "text",
			type: "post",
			data: //"id="+$(':input[name=id]').val()
			"url="+$('#attachFileImg').val(),
			
			contentType: "text/html; charset=UTF-8",
			success: function(data){
				$('#attachFileImg').props('src',data);
			},
			error: function(){
				alter("이미지 미리보기 실패");
			}
		});
	});
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body style="background: linear-gradient(to left, #ffffff, #ffdde1)">
	<!-- 네비게이션바 시작 -->
	<jsp:include page="/Template/NailartTop.jsp" />
	<!-- 네비게이션바 끝 -->
	<div class="container">
		<!-- 점보트론(Jumbotron) -->
		<div class="jumbotron"
			style="background: linear-gradient(to right, #faaca8, #ddd6f3)">
			<h1 style="text-align: center; color: white; font-style: bold">글
				쓰기</h1>
		</div>
	</div>
	<!-- 실제 내용 시작 -->
	<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
		<div class="row">
			<!-- ------------------------------------------------------------------------------- -->
			<form class="form-horizontal" method="post"
				enctype="multipart/form-data" runat="KimYouKyungProj2Server"
				action="<c:url value='/Nailart/GalleryWrite.kosmo'/>">
				<div class="col-xs-2 col-xs-offset-10 col-md-1 col-md-offset-11">
					<button type="submit" class="btn"
						style="background: linear-gradient(to right, #faaca8, #ddd6f3); color: white"
						role="button">등록</button>
				</div>
				<div class="form-group">
					<div class="col-xs-8 col-xs-offset-2 col-md-4 col-md-offset-4">
						<img class="img-rounded" id="attachFileImg" src="#" alt="사진첨부" />
						<input type="file" id="attachfile">
					</div>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="id"
						value="${sessionScope.id}" />
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="title" placeholder="제목" />
				</div>
				<div class="form-group">
					<textarea class="form-control" name="content" rows="5"
						placeholder="내용 입력하세요"></textarea>
				</div>
			</form>
		</div>
	</div>

	<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
		<h1></h1>
	</div>
	<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
		<h1></h1>
	</div>
	<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
		<h1></h1>
	</div>
	<div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3">
		<h1></h1>
	</div>
	<div class="modal fade" id="small-modal" data-backdrop="static">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-body">
					<button class="close" data-dismiss="modal">
						<span>&times; 
					</button>
					</button>
					<h5 class="modal-title">
						<span class="glyphicon glyphicon-bullhorn"></span> 경고 메시지
					</h5>
					<h6 id="warningMessage"></h6>
				</div>

			</div>
		</div>
	</div>
	<!-- 실제 내용 끝 -->
	<!-- 푸터 시작 -->
	<jsp:include page="/Template/NailartFooter.jsp" />
	<!-- 푸터 끝 -->
	
	<script>
		/*    	
		//파일 사이즈(바이트):파일객체.files[0].size
		//파일 명:파일객체.files[0].name
		//파일 컨텐츠 타입:파일객체.files[0].type
		 */
		$(function() {
			var focusObject;

			//모달창이 닫혔을때 발생하는 이벤트 처리 - 즉 해당 입력 요소 에 포커스 주기
			$('#small-modal').on('hidden.bs.modal', function() {
				focusObject.focus();
			});

			$('form').on('submit', function() {

				if ($(this).get(0).title.value == "") {
					$('#warningMessage').html("제목을 입력하세요");
					$('#small-modal').modal('show');
					focusObject = $(this).get(0).title;
					return false;
				}
				if ($(this).get(0).attachFile.value == "") {
					$('#warningMessage').html("파일을 첨부하세요");
					$('#small-modal').modal('show');
					focusObject = $(this).get(0).attachFile;
					return false;
				}
				if ($(this).get(0).content.value == "") {
					$('#warningMessage').html("내용를 입력하세요");
					$('#small-modal').modal('show');
					focusObject = $(this).get(0).content;
					return false;
				}
			});
		});
	</script>
</body>
</html>