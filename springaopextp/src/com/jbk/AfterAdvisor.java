package com.jbk;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		System.out.println("additional concern after returning advice");
		
	}

	
	
}
