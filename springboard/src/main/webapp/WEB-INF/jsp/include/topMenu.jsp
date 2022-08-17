<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">Navbar</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<div class="d-flex justify-content-end">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="${pageContext.request.contextPath}/board">게시판</a></li>

					<c:choose>
						<c:when test="${empty loginVO}">
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/login">로그인</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/member/register">회원가입</a></li>

						</c:when>
						<c:otherwise>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" role="button"
								data-bs-toggle="dropdown" aria-expanded="false">
									${loginVO.name}님 안녕하세요 </a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">마이페이지</a></li>
								</ul></li>

							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/logout">로그아웃</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</div>
</nav>