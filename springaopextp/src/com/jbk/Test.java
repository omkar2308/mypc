package com.jbk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		
		A a=(A) factory.getBean("proxy",A.class);
		//System.out.println("proxy class name: "+a.getClass().getName());  
		a.m();
		
//		B a1=(B) factory.getBean("proxy",B.class);
// 		a1.m();
 		
 		
		
	}

}
