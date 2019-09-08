<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- DataTales Example -->

	<h4 class="m-0 font-weight-bold text-dark">Table</h6>
</div>

<div class="container-fluid">
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
					<td> <fmt:formatDate pattern="yyyy-MM-dd" value = "${board.bDate}"/></td>
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
				<ul class="pagination my justify-content-end">
					<li class="page-item page-item-dark <c:out value="${pageMaker.prev ? '':'disabled'}" />">
						<a class="page-link" href="${path }/board/list${pageMaker.makeQuery(pageMaker.begin - 1)}" tabindex="-1">Previous</a>
					</li>
					<c:forEach var="idx" begin="${pageMaker.begin }" end="${pageMaker.end }">
						<li class="page-item <c:out value="${pageMaker.cri.page == idx ? 'active':''}"/>"><a class="page-link text-dark" href="${path }/board/list${pageMaker.makeQuery(idx)}">${idx }</a></li>
					</c:forEach>
					<li class="page-item <c:out value="${pageMaker.next ? '':'disabled'}" />">
					<a class="page-link" href="${path }/board/list${pageMaker.makeQuery(pageMaker.end + 1)}">Next</a></li>
				</ul>
			</div>
		</div>


	</div>




<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>