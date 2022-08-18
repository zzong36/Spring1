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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	function getAllReply(){
		$('#replyList').empty();
		$.ajax({
			url : '${pageContext.request.contextPath}/reply/${board.no}' ,
			type: 'get',
			success: function(data){
				console.log(data);
				console.log(typeof data);
				let list = JSON.parse(data);
				console.log(list);
				$(list).each(function(){
					let str = '';
					str += '<hr>'
					str +='<div>'
					str +='<strong>' + this.content  +'</strong>' + '  ';
					str += this.writer + '  ';
					str += this.regDate + '  ';
					str += '</div>'
					$('#replyList').append(str);
				})
			},
			error:	function(){
				alert('실패2');
			}
		})
	}

	$(document).ready(function(){
		getAllReply();
		
		$('#AddReplyBtn').click(function(){
			
			let r_content = document.rform.content.value;
			let r_writer = document.rform.writer.value;
			console.log(r_content);
			$.ajax({
				url: '${pageContext.request.contextPath}/reply',
				method : 'post',
				data : {
					boardNo: ${board.no},
					content: r_content,
					writer: r_writer
				},
				success: function(){
					alert('성공');
					//댓글 보기
					getAllReply();
				},
				error : function(){
					alert('실패');
				},
				complete : function(){
					
				}
			})
		})
	})
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />


	<div class="container">
		<div class="row">
			<div class="col-md-10 justify-content-center">
				<h1>상세게시글 입니다</h1>
				<h2 class="text-muted">${board.title}</h2>
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

		<div class="row">
			<div class="col-md-10">
			<h3>댓글목록</h3>
				<div id="replyList"></div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-10 justify-content-center">
				<form name="rform">
					<div class="my-3">
						<label for="exampleFormControlInput1" class="form-label">작성자</label>
						<input type="text" class="form-control"
							id="exampleFormControlInput1" name="writer">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlTextarea1" class="form-label">댓글</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							name="content" rows="3"></textarea>
					</div>
					<input class="btn btn-outline-secondary" type="button" value="댓글작성"
						id="AddReplyBtn">
				</form>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>