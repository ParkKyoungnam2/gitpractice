<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- Begin Page Content -->
<div class="container-fluid">
	<div id="mycarousel" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#mycarousel" data-slide-to="0" class="active"></li>
			<li data-target="#mycarousel" data-slide-to="1"></li>
			<li data-target="#mycarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner kn">
			<div class="carousel-item active">
				<img class="d-block w-100" src="${path }/resources/img/img1.jpg"
					alt="First slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="${path }/resources/img/img2.jpg"
					alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="${path }/resources/img/img3.jpg"
					alt="Third slide">
			</div>
		</div>
		<a class="carousel-control-prev" href="#mycarousel" role="button"
			data-slide="prev"> <span class="carousel-control-prev-icon"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#mycarousel" role="button"
			data-slide="next"> <span class="carousel-control-next-icon"
			aria-hidden="true"></span> <span class="sr-only">Next</span>
		</a>
	</div>
	<hr>
	<h4 class="m-0 font-weight-bold text-dark">Table</h4>
	<hr>
	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th style="width: 8.33%">#</th>
				<th style="width: 50%">글제목</th>
				<th style="width: 16.66%">작성자</th>
				<th style="width: 16.66%">작성일</th>
				<th style="width: 8.33%">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>${board.bNo}</td>
					<td><a href="${path }/board/read?bno=${board.bNo}">${board.bTitle}</a></td>
					<td>${board.bName}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.bDate}" /></td>
					<td>${board.bHit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="row">
		<div class="col-sm">
			<button class="btn btn-outline-secondary" type="button"
				onclick="location.href='${path}/board/write'">글 쓰 기</button>
		</div>
		<div class="col-sm">
			<ul class="pagination kn justify-content-end">
				<li
					class="page-item page-item-dark <c:out value="${pageMaker.prev ? '':'disabled'}" />">
					<a class="page-link"
					href="${path }/board/list${pageMaker.makeQuery(pageMaker.begin - 1)}"
					tabindex="-1">Previous</a>
				</li>
				<c:forEach var="idx" begin="${pageMaker.begin }"
					end="${pageMaker.end }">
					<li
						class="page-item <c:out value="${pageMaker.cri.page == idx ? 'active':''}"/>"><a
						class="page-link text-dark"
						href="${path }/board/list${pageMaker.makeQuery(idx)}">${idx }</a></li>
				</c:forEach>
				<li
					class="page-item <c:out value="${pageMaker.next ? '':'disabled'}" />">
					<a class="page-link"
					href="${path }/board/list${pageMaker.makeQuery(pageMaker.end + 1)}">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>





<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>