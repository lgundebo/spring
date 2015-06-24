package com.tutorial.spring.bean_autowire;

public class Student {
	private String studentName;
	private MarkList makrList;
	
	public Student(){
		
	}

	public Student(String studentName, MarkList makrList) {
		super();
		this.studentName = studentName;
		this.makrList = makrList;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public MarkList getMakrList() {
		return makrList;
	}

	public void setMakrList(MarkList makrList) {
		this.makrList = makrList;
	}
	
}
