package com.tutorial.spring.bean_autowire;

public class MarkList {
	private String subject;
	private int marks;
	
	public MarkList(){
		
	}
	public MarkList(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
