package com.tutorial.spring.bean_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_autowire.xml");
		Student student = (Student)context.getBean("Student");
		System.out.println("For Student "+ student.getStudentName()+" Marks in "+student.getMakrList().getSubject()+" is "+student.getMakrList().getMarks());
	}

}
