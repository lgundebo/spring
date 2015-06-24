package com.tutorial.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student)context.getBean("Student");
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("Branch Name: "+student.getBranchName());
		Faculty faculty = (Faculty) student.getFaculty().get("Mathematics");
		System.out.println("Faculty Name: "+faculty.getFacultyName());	
		System.out.println("Faculty Classes: "+faculty.getClassRoom().toString());	
	}

}
