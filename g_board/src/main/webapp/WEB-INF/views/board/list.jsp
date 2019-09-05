<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- DataTales Example -->

	<h6 class="m-0 font-weight-bold text-primary">Table</h6>
</div>
<div class="card-body">

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
					<td><a href="${path }/board/read?bno=${list.bNo}">${list.bTitle}</a></td>
					<td>${list.bName}</td>
					<td>${list.bDate}</td>
					<td>${list.bHit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<div class="container">
<div class="row">
<div class="col-sm"><button class="btn btn-primary btn-right" type="button"
			onclick="location.href='${path}/board/write'">글 쓰 기</button>
			</div>
<div class="col-sm"> <ul class="pagination justify-content-end">
    <li class="page-item disabled">
      <a class="page-link" href="#" tabindex="-1">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item active"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#">Next</a>
    </li>
  </ul></div>
</div>

 
</div>
	
			
</div>

<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>