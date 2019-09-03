<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- Begin Page Content -->
<div class="container">

	<!-- DataTales Example -->

	<h3 class="m-0 font-weight-bold text-primary">글 읽 기</h3>
</div>
<div class="container">
	
		<div class="form-group">
			글제목<input class="form-control" name="bTitle" value="${read.bTitle }" readonly/>
		</div>
		<div class="form-group">
			작성자<input class="form-control" name="bName" value="${read.bName }" readonly/>
			
		</div>
		<div class="form-group">
			글내용
			<textarea class="form-control" rows="10" name="bContent" readonly>${read.bContent }</textarea>
		</div>
		<button class="btn btn-primary" type="button"
			onclick="location.href='${path}/board/write'">글 쓰 기</button>
		<button class="btn btn-primary" type="button"
			onclick="location.href='${path}/board/list'">목 록</button>
	
</div>


<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>