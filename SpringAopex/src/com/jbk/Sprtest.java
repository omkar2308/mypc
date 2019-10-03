package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sprtest {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("appcontext.xml");
		
		System.out.println("before aop.................");
		StuAop stusimple =(StuAop) context.getBean("stusimple");
		stusimple.m1();
		stusimple.m2();
		
		System.out.println("after aop...................");
		StuAop stusimple1 =(StuAop) context.getBean("stuAspe");
		stusimple1.m1();
		stusimple1.m2();
		
	}

}
