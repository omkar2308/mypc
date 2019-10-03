package com.stringPatt;

public class StringBuffer_demo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		sb.append("By Kiran");
		System.out.println(sb);
		sb.insert(1, "PUNE");
		System.out.println(sb);
		sb.replace(1, 3, "KOLHA");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("jj");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
