package com.javabykiran;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionLab10 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		Student s1=new Student();
		s1.name="akshay";
		s1.age=25;
		
		Student s2=new Student();
		s2.name="abhi";
		s2.age=23;
		
		Student s3=new Student();
		s3.name="nnn";
		s3.age=24;
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		System.out.println("short by name ");
		Collections.sort(a1,new NameComaprator());
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.name+","+st.age);
		}
		
		System.out.println("short by age ");
		Collections.sort(a1,new AgeComaprator());
		
		Iterator itr2=a1.iterator();
		while(itr2.hasNext()){
			Student st=(Student)itr2.next();
			System.out.println(st.name+","+st.age);
		
		}}
	}


