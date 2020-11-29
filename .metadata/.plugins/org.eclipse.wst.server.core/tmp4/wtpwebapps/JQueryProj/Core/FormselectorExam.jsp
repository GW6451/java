<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FormselectorExam.jsp</title>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function(){
		$(':button:first').click(function(){
			$('#desc').val($('#src').val());
		});
		$('#sel').on('change',function(){
			$('#sport').val($(this).val()=='baseball'?'야구': $(this).val()=='balleyball'? '배구':'축구');
		});
		$('#btn').click(function(){
			$('#gender').val($(':radio:checked').val()=='M'?'남자':'여자');
		});
		/////문제]
		$(':checkbox').click(function(){
			if($(this).val()=='all'){//전체선택 클릭
				if($(this).prop('checked')){//전체선택 체크
					$(':checkbox:gt(0)').each(function(){
						$(this).prop('checked',true);
					});
				}///if
				else{//전체 선택 해제
					$(':checkbox:gt(0)').each(function(){
						$(this).prop('checked',false);
					});
				}////else
			}////전체선택 클릭 if
			else{//전체 선택이 아닌 체크박스 클릭
				if($(this).prop('checked')){//전체선택 체크
					if($(':checkbox:gt(0)').length==$(':checkbox:checked').length){
						$(':checkbox:first').prop('checked',true);
					}
				}
				else{
					$(':checkbox:first').prop('checked',false);
				}
			}////전체선택 클릭 else
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>폼 셀렉터 연습</legend>
		<h2>텍스트 복사</h2>
		<input type="text" name="src" id="src" /> <input type="button"
			value="복사" /> <input type="text" name="desc" id="desc" /> ​
		<h2>선택상자의 값 복사</h2>
		<select name="sel" id="sel">
			<option value="baseball">야구</option>
			<option value="balleyball">배구</option>
			<option value="scocker">축구</option>
		</select> <input type="text" name="sport" id="sport" />
		<h2>radio상자의 값 복사</h2>
		<input type="radio" name="sex" value="M" />남자 <input type="radio"
			name="sex" value="W" />여자 <input type="text" name="gender"
			id="gender" /> <input type="button" value="확인" id="btn" />
		<h2>메일선택</h2>
		<input type="checkbox" value="all">전체 선택
		<ul style="list-style-type: decimal;">
			<li><input type="checkbox" name="mailing" value="mail1" />메일1</li>
			<li><input type="checkbox" name="mailing" value="mail2" />메일2</li>
			<li><input type="checkbox" name="mailing" value="mail3" />메일3</li>
			<li><input type="checkbox" name="mailing" value="mail4" />메일4</li>
			<li><input type="checkbox" name="mailing" value="mail5" />메일5</li>
		</ul>
	</fieldset>
</body>
</html>