<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>

	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />

	<div class="container">
		<div class="row">
			<div class="col-md-10 justify-content-center">
				<h1 class="text-center my-3">게시판</h1>
				<div class="d-flex justify-content-end">
					<a href="${pageContext.request.contextPath}/board/write"
						class="btn btn-outline-success mb-3">새글쓰기</a>
				</div>
				<table class="table table-success table-striped table-hover">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">제목</th>
							<th scope="col">작성자</th>
							<th scope="col">작성일자</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${boardlist }" var="board">
							<tr>
								<td>${board.no }</td>
								<td><a
									href="${pageContext.request.contextPath}/board/detail/${board.no}">${board.title }</a></td>
								<%--<td><a href="${pageContext.request.contextPath}/board/detail?boardNo=${board.no}">${board.title }</a></td> --%>
								<td>${board.writer }</td>
								<td>${board.regDate}</td>
							</tr>
						</c:forEach>
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