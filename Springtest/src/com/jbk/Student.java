package com.jbk;

public class Student {
	
	public Student() {
		
		System.out.println("im in const....");
	
		
	}
	Address add;
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	Phone ph;
	public Phone getPh() {
		return ph;
	}
	public void setPh(Phone ph) {
		this.ph = ph;
	}
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
