package com.mycompany.myapp.domain;

import java.util.Date;


public class BoardVO {
	private Long bNo;
	private String bName;
	private String bTitle;
	private String bContent;
	private Date bDate;
	private Date bUpdateDate;
	private Long bhit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	public Long getbNo() {
		return bNo;
	}
	public void setbNo(Long bNo) {
		this.bNo = bNo;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public Date getbUpdateDate() {
		return bUpdateDate;
	}
	public void setbUpdateDate(Date bUpdateDate) {
		this.bUpdateDate = bUpdateDate;
	}
	public Long getBhit() {
		return bhit;
	}
	public void setBhit(Long bhit) {
		this.bhit = bhit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	
	
	
	
	
}
