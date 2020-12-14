<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${WHERE =='INS' }">
		<c:set var="successMsg" value="�Է� �����߾��"/>
		<c:set var="failMsg" value="�Է� �����߾��"/>
		<c:set var="successUrl" value="/Nailart/View.kosmo"/>
	</c:when>
	<c:when test="${WHERE =='EDT' }">
		<c:set var="successMsg" value="���� �����߾��"/>
		<c:set var="failMsg" value="���� �����߾��"/>
		<c:set var="successUrl" value="/Nailart/View.kosmo?no=${no}"/>
	</c:when>
	<c:otherwise>		
		<c:set var="successMsg" value="���� �����߾��"/>
		<c:set var="failMsg" value="���� �����߾��"/>
		<c:set var="successUrl" value="/Nailart/List.kosmo"/>
	</c:otherwise>
</c:choose>