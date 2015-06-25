package com.tutorial.spring.aop;

import org.aspectj.lang.JoinPoint;

public class Logging {
	
	/**
	 * Calling before a selected method execution
	 */
	public void beforeAdvice(){
		System.out.println("Logging activity for before advice!!!");
	}
	
	/**
	 * Calling after a selected method execution
	 */
	public void afterAdivce(){
		System.out.println("Logging activity for after advice!!!");
	}
	
	/**
	 * Calling after successful return of any method.
	 */
	
	/*public void afterReturning(JoinPoint joinPoint, Object returnValue) throws Throwable{
		System.out.println("Logging activity for after returning advice:"+returnValue.toString());
	}
	*/
	/**
	 * Calling after throwing an exception
	 */
	public void aftherThrowingExceptionAdvice(IllegalArgumentException ex){
		System.out.println("Logging After throwing an exception: "+ex.getMessage());
	}
	
}
