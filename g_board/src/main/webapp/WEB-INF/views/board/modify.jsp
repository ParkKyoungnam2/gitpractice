<%@include file="../include/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- Begin Page Content -->
<div class="container">

	<!-- DataTales Example -->

	<h3 class="m-0 font-weight-bold text-primary">글 쓰 기</h3>
</div>
<div class="container">
	<form action="${path }/board/modifyform" method="post">
		<input type="hidden" name="bNo" value="${board.bNo }">
		<div class="form-group">
			글제목<input class="form-control" name="bTitle" value="${board.bTitle }"></input>
		</div>
		<div class="form-group">
			작성자<input class="form-control" name="bName" value="${board.bName }"></input>
		</div>
		<div class="form-group">
			글내용
			<textarea class="form-control" rows="10" name="bContent">${board.bContent }</textarea>
		</div>
		<button class="btn btn-primary" type="submit">글 수 정</button>
		<button class="btn btn-primary" type="button"
			onclick="location.href='${path}/board/list'">목 록</button>
		<button class="btn btn-danger" type="button">글 삭 제</button>
	</form>
</div>


<!-- /.container-fluid -->

<%@include file="../include/footer.jsp"%>