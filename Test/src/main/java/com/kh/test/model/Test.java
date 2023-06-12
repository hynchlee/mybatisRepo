package com.kh.test.model;

public class Test {

	private String writer;
	private String title;
	private String content;
	private String regDate;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(String writer, String title, String content, String regDate) {
		super();
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ModelVo [writer=" + writer + ", title=" + title + ", content=" + content + ", regDate=" + regDate + "]";
	}
	
}
