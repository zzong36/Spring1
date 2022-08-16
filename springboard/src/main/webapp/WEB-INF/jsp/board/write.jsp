<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글쓰기</title>
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
				<h1>글작성</h1>
				<form:form action="${pageContext.request.contextPath}/board/write"
					method="post" modelAttribute="boardVO1">
					<table class="table table-warning table-striped table-hover">
						<tbody>
							<tr>
								<th scope="col">제목</th>
								<td><form:input path="title" size="30" /> 
								<form:errors
										path="title" class="error"></form:errors></td>
							</tr>
							<tr>
								<th scope="col">작성자</th>
								<td><form:input path="writer" size="30" /> 
								<form:errors path="writer" class="error"></form:errors></td>
							</tr>
							<tr>
								<th scope="col">내용</th>
								<td><form:input path="content" size="50" /> <form:errors
										path="content" class="error"></form:errors></td>
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