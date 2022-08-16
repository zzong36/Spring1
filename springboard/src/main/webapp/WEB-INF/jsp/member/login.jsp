<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>
	if ('${loginmsg}') {
		alert('${loginmsg}');
	}
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">

<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10 justify-content-center">
				<h1>로그인</h1>
				<form:form action="${pageContext.request.contextPath}/login"
					method="post" modelAttribute="memberVO">
					<table class="table table-striped table-hover">
						<tbody>
							<tr>
								<th scope="col">아이디</th>
								<td><form:input path="id" size="30" /> <form:errors
										path="id" class="error"></form:errors></td>
							</tr>
							<tr>
								<th scope="col">비밀번호</th>
								<td><form:input path="password" size="30" /> <form:errors
										path="password" class="error"></form:errors></td>
							</tr>
						</tbody>
					</table>
					<input type="submit" value="입력" class="btn btn-outline-warning">
				</form:form>
			</div>
		</div>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>