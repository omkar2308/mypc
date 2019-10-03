package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	
	public static void main(String[] args) {
		
		/*Student stu=new Student();
		stu.age=55;
		
		Phone ph=new Phone();
		ph.landline=444;
		stu.ph=ph1;*/
		
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student stu=(Student)context.getBean("stu");
		//Address add= (Address)context.getBean("add");
		// System.out.println(stu);
		
		System.out.println("Age " + stu.age);
		//System.out.println(stu.getAge());
		System.out.println("landline " +stu.getPh().getLandline());
		System.out.println("Mob no "+stu.getPh().getMobno());
		
		//System.out.println( "Address " +add.getAdd());
		
		System.out.println("Address "+stu.getAdd());
		
		//System.out.println("Address "+add.getKey()+add.getValue());
		
		
		
		
		
		
		
	}

}
