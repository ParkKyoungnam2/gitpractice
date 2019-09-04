package com.mycompany.myapp.domain;

public class Criteria {
	
	private int page; // 몇번째 페이지 인가
	private int max; // 페이지당 보여줄 최대 글 수.

	
	
	public Criteria() {
		this(1,10);
	}
	public Criteria(int page, int max) {
		this.page = page;
		this.max = max;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

}
