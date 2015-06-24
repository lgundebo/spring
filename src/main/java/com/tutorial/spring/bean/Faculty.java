package com.tutorial.spring.bean;

import java.util.List;
import java.util.Map;

public class Faculty extends Branch{
	
	private String facultyName;
	private String facultyCode;
	private List subjects;
	
	public Faculty(){
		
	}

	public Faculty(String facultyName, String facultyCode, List classRoom) {
		super();
		this.facultyName = facultyName;
		this.facultyCode = facultyCode;
		this.subjects = classRoom;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyCode() {
		return facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	public List getClassRoom() {
		return subjects;
	}

	public void setClassRoom(List classRoom) {
		this.subjects = classRoom;
	}

	
}
