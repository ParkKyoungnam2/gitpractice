package com.mycompany.myapp.domain;

import java.util.Date;

public class BoardVO {
	private double bNo;
	private String bName;
	private String bTitle;
	private String bContent;
	private Date date;
	private Date updateDate;
	private double bhit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	
	public double getbNo() {
		return bNo;
	}
	public void setbNo(double bNo) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public double getBhit() {
		return bhit;
	}
	public void setBhit(double bhit) {
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
