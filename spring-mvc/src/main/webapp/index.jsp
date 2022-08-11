<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="<%= request.getContextPath()%>/method/method.do">method</a><br>
<a href="<%= request.getContextPath()%>/form/joinForm.do">join</a><br>
<a href="<%= request.getContextPath()%>/resBody.do">responseBody</a><br>
<a href="<%= request.getContextPath()%>/resBody.json">Json 응답1</a><br>
<a href="<%= request.getContextPath()%>/resVOBody.json">Json 응답2</a><br>
<a href="<%= request.getContextPath()%>/resStringListBody.json">Json List(문자열) 응답</a><br>
<a href="<%= request.getContextPath()%>/resVOListBody.json">Json 회원리스트 응답</a><br>

</body>
</html>