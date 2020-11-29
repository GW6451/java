<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FormSelector.jsp</title>
<!-- jQuery사용을 위한 라이브러리 임베딩 -->
<!-- 1]다운 받은 .js파일 임베디드 -->
<!-- 
<script src="<c:url value="/js/jquery-3.5.1.js"/>"></script>
 -->
<!-- 2]CDN(Content Delivery Network)주소 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	//factory함수*(나중에 배움)
	$(function(){
		//1]input과 : input선택자
		/*
		$('input') : input으로 시작하는 모든 태그 선ㄴ택
		$(':input') : input태그 뿐만 아니라 폼의 모드ㅡㄴ 하위 요소 태그 선택
		*/
		console.log('input태그 선택자:',$('input').length);
		console.log('폼선택자:',$(':input').length);
		console.log(':button 선택자:',$(':button').length);//<button>도 포함됨
		/*
		val()함수 -폼의 하위요소의 값을 읽어오거나 설정]
		-읽어올때 : $('폼의하위요소').val();
		-설정할떄 : $('폼의하위요소').val("값");
		*/
		$('button').click(function(){
			switch($(this).html()){
				case "값 읽기":
					//1]input type="button"혹은 <button>태그
					/*
					$(":button")으로 선택시 input type="button"뿐만 아니라 <button>태그도 선택됨
					input type="button"만 선택하고자 할때는 
					$('input[type=button]') 혹은
					$(":button[type=button]")
					
					*/
					$('button').each(function(i){
						console.log('%d번째 버튼의 타입:%s',i,$(this).prop('type'));
						if($(this).is('[type=button]')){
							console.log('%d번째 버튼의 value속성:%s',i,$(this).val());
						}
						else{
							//console.log('%d번째 버튼의 value속성:%s',i,$(this).val());
							console.log('%d번째 버튼의 value속성:%s',i,$(this).html());
						}
						//2]input type="text"
						// :text나 혹은 input[type=text]
						console.log('type=text의 갯수 : ',$(':text').length);
						console.log('type=text의 입력값 : ',$(':text').val());//하나밖에 없어서 each()적용 불필요
						//3]input type="password"
						// :password나 혹은 input[type=password]
						console.log('type=password의 갯수 : ',$(':password').length);
						console.log('type=password의 입력값 : ',$(':password').val());//하나밖에 없어서 each()적용 불필요
						//4]input type="checkbox"
						//$(':checkbox').val() : 체크된 값을 읽어오는게 아니라 첫번쨰 체크박스의 value값을 읽어 온다
						//*체크된것만 읽고자 할때
						//$(':checkbox:checked')에 each()함수를 적용해서 얻는다.
						//$(':checkbox)는 체크박스.라디오버튼.선택상자 모두 포함해서 체크된 모든객체를 의미
						console.log('체크된 총 요소의 수 : ',$(':checked').length);
						//4-1]$(':checkbox').val():체크에 상관없이 첫번쨰 값만 읽어옴
						console.log("$(':checkbox').val() : ", $(':checkbox').val());
						//4-2]방법1-체크된것만 읽어오기
						console.log("[체크된것만 읽어오기]");
						console.log('1. :checkbox:checked와 each()함수');
						$(':checkbox:checked').each(function(){
							console.log($(this).val());
						});
						console.log('2. :checkbox와 filter함수와 each()함수');
						$(':checkbox').filter(':checked').each(function(){
							console.log($(this).val());
						});
						console.log('3. :checkbox와 if()로 체크된 것 판단 그리고 each()함수');
						$(':checkbox').each(function(){
							if($(this).prop('checked')==true)
								console.log($(this).val());
						});
						//5]input type="file"
						console.log('type=file의 value : ',$(':file').val());
						//6]input type="hidden"
						//:hidden으로 선택하지말고
						//input[type=hidden]나 :input:hidden
						//console.log('type=hidden의 value : ',$(':hidden').val());//빈문자열
						console.log('type=hidden의 value : ',$(':input:hidden').val());
						console.log("$('input[type=hidden]').val() ",$('input[type=hidden]').val());
					});
					console.log("$('input[type=image]').val() ",$('input[type=image]').val());
					console.log("$(':image').val() ",$(':image').val());
					console.log("$(':image').prop('value') ",$(':image').prop('value'));
					//8]input type="radio"
					//선택에 상관없이 무조건 첫번째 요소값만 읽어옴] $(":radio").val()
					console.log("$(':radio').val() ",$(':radio').val());
					//체크된것만 읽어오기 :$(':radio:checked').val() ",$(':radio:checked').val())
					console.log("$(':radio:checked').val() ",$(':radio:checked').val());
					//9]reset 및 submit버튼
					console.log("$(':reset').val() : ",$(':reset').val());
					//버튼 태그도 type=submit 고로 무조건 첫번째만 가져온다
					console.log("$(':submit').val() : ",$(':submit').val());
					console.log("$(':input[type=submit]').val() : ",$(':input[type=submit]').val());
					/*
					10]select태그
					$("select").val()-선택된 값을 바로 가져옴.
					:select는 폼 선택자 없다
					*/
					//console.log($(':select'))//[x]에러
					console.log("$('select').val() : ",$('select').val());
					console.log("$(':selected').val() : ",$('select').children(':selected').val());
					//:textarea 폼 셀렉터는 없다
					console.log("$('textarea').val() : ",$('textarea').val());
					//아래는 초기 설정값만 읽어옴. 입력한 값은 읽지 못함
					console.log("$('textarea').html() : ",$('textarea').html());
					console.log("$('textarea').text() : ",$('textarea').text());
					break;
				default://값 설정
					//폼의 하위 요소값 설정하기
					//1]input type="button"
					$(':button:eq(0)').val('입력버튼');
					//2]input type="text"
					$(':text').val('아이디를 입력하세요');
					//3]input type='password'
					$(':password').val('비밀번호를 입력하세요');
					//방법1]반드시 배열 초기화자[]로 값 설정
					/*
					var checkedBox = []//new Array();
					checkedBox.push('정치');
					checkedBox.push('연예');
					$(':checkbox').val(checkedBox);
					*/					
					//$(':checkbox').val(['경제','연예']);
					//$(':checkbox').val(['연예']);
					//방법2] attr()함수로 checked속성 이용
					$(':checkbox[value=연예],:checkbox[value=경제]').attr('checked','checked');
					//5]input type='radio'
					$(':radio').val(['녀']);
					//6]select태그
					//방법1]val()사용
					//$('select').val('대학교');
					//$('select').val(['대학교']);
					//방법2]attr()함수로 selected속성 이용
					$('select').children('[value=대학교]').attr('selected','selected');
					//7]textarea
					$('textarea').val('안녕하세요\r\n반가워요');
					
			}
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>jQuery의 폼 셀렉터</legend>
		<input type="button" value="Input Button" /><br />
		<input type="text" /><br />
		<input type="password" /><br />
		<input type="checkbox" value="정치" name="inter" />정치
		<input type="checkbox" value="경제" name="inter" />경제
		<input type="checkbox" value="연예" name="inter" />연예 <br />
		<input type="file" /><br />
		<input type="hidden" value="히든값" /><br />
		<input type="image" alt="이미지" src="<c:url value='/Images/1.jpg'/>" /><br />
		<input type="radio" value="남" name="gender" checked />남
		<input type="radio" value="녀" name="gender" />녀 <br />
		<input type="reset" value="취소" /><br />
		<input type="submit" value="전송" /><br />
		<select>
			<option value="">학교를 선택하세요</option>
			<option value="초등학교">초등학교</option>
			<option value="대학교">대학교</option>
		</select><br /> ​
		<textarea>텍스트 에리어</textarea>
		<br />
		<button>값 읽기</button>
		<button>값 설정</button>
		<br />
	</fieldset>
</body>
</html>