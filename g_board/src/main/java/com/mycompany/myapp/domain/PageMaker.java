package com.mycompany.myapp.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

	Criteria cri; // 페이지 기준

	long totalCount; // 전체글 수

	int begin; // 숫자버튼 의 시작 숫자
	int end; // 숫자버튼의 끝 숫자

	boolean prev; // 앞으로가는 거
	boolean next; // 뒤로가는거

	int PageButtonCount; // 페이지에 보여지는 숫자버튼 개수

	public PageMaker(Criteria cri, long totalCount) {
		this.cri = cri;
		this.totalCount = totalCount;
		this.PageButtonCount = 10;

		this.end = (int) Math.ceil(cri.getPage() / this.PageButtonCount * 1.0) * this.PageButtonCount;
		// 소수점 이하 를 올리는 방식
		this.begin = this.end - this.PageButtonCount + 1;
		int realEnd = (int) Math.ceil(totalCount / cri.getMax() * 1.0);

		if (realEnd < this.end) {
			this.end = realEnd;
		}

		this.prev = this.begin > 1; // 시작버튼이 1인경우는 false
		this.next = this.end < realEnd;

	};

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getPageButtonCount() {
		return PageButtonCount;
	}

	public void setPageButtonCount(int pageButtonCount) {
		PageButtonCount = pageButtonCount;
	}
	
	public String makeQuery(int page) {
		UriComponents uriComponentsBuilder = UriComponentsBuilder.newInstance().queryParam("page", page)
				.queryParam("max", cri.getMax())
				.build();
		return uriComponentsBuilder.toUriString(); 
	}

}
