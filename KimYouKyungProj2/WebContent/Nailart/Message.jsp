<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${WHERE =='INS' }">
		<c:set var="successMsg" value="입력 성공했어요"/>
		<c:set var="failMsg" value="입력 실패했어요"/>
		<c:set var="successUrl" value="/Nailart/View.kosmo"/>
	</c:when>
	<c:when test="${WHERE =='EDT' }">
		<c:set var="successMsg" value="수정 성공했어요"/>
		<c:set var="failMsg" value="수정 실패했어요"/>
		<c:set var="successUrl" value="/Nailart/View.kosmo?no=${no}"/>
	</c:when>
	<c:otherwise>		
		<c:set var="successMsg" value="삭제 성공했어요"/>
		<c:set var="failMsg" value="삭제 실패했어요"/>
		<c:set var="successUrl" value="/Nailart/List.kosmo"/>
	</c:otherwise>
</c:choose>