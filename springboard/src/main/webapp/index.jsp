<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>
</head>
<body>
	<c:if test="${ not empty loginVO}">
		${loginVO.name} 반가워요 <br>
	</c:if>
	<a href="${pageContext.request.contextPath}/board">게시판</a> <br>
	
	<c:if test="${empty loginVO}">
	<a href="${pageContext.request.contextPath}/login">로그인</a> <br>
	<a href="${pageContext.request.contextPath}/member/register">회원가입</a> <br>
	</c:if>
	<c:if test="${ not empty loginVO}">
		<a href="${pageContext.request.contextPath}/logout">로그아웃</a> <br>
	</c:if>
</body>
</html>