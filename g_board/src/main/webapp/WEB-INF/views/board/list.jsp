<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- DataTales Example -->

	<h6 class="m-0 font-weight-bold text-primary">Table</h6>
</div>
<div class="container">
	
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.bNo}</td>
					<td>${list.bTitle}</td>
					<td>${list.bName}</td>
					<td>${list.bDate}</td>
					<td>${list.bHit}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
</div>


<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>