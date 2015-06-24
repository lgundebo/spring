package com.tutorial.spring.bean_di;

import java.util.List;
import java.util.Map;

public class Student extends Branch {
	
	private String studentName;
	private String rollNumber;
	private Map faculty;
	
	public Student(){
		
	}

	public Student(String studentName, String rollNumber, Map faculty) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.faculty = faculty;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Map getFaculty() {
		return faculty;
	}

	public void setFaculty(Map faculty) {
		this.faculty = faculty;
	}

	
}
