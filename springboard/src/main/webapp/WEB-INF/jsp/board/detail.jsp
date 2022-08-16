<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세게시글</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>

	상세게시글 입니다

	<div class="container">
		<div class="row">
			<div class="col-md-10 justify-content-center">
			<h1>${board.title} </h1>
				<table class="table table-warning table-striped table-hover">
					<tbody>
						<tr>
							<th scope="col">#</th>
							<td>${ board.no }</td>
						</tr>
						<tr>
							<th scope="col">제목</th>
							<td>${ board.title }</td>
						</tr>
						<tr>
							<th scope="col">작성자</th>
							<td>${ board.writer }</td>
						</tr>
						<tr>
							<th scope="col">내용</th>
							<td>${ board.content }</td>
						</tr>
						<tr>
							<th scope="col">조회수</th>
							<td>${ board.viewCnt }</td>
						</tr>
						<tr>
							<th scope="col">작성일자</th>
							<td>${ board.regDate }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>