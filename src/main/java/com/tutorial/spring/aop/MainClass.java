package com.tutorial.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Student student = (Student)context.getBean("student");
		System.out.println("Student Name:"+student.getName());
	}

}
