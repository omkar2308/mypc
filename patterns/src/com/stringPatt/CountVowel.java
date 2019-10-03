package com.stringPatt;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		int count =0;
		int num=0;
		for (int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ) {
			count++;
		}else {
			num++;
		}
	}System.out.println("There are "+count +"+vowels and "+num +" consonant");
}}
