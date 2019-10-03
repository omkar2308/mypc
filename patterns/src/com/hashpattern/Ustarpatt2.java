package com.hashpattern;

import java.util.Scanner;

public class Ustarpatt2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		int count=1;
		int noofspace=1;
		for(int i=1;i<(n*2);i++) {
		for(int spc=n-noofspace; spc>0;spc--) {
			System.out.print("");
		}if (i<n) {
			noofspace++;
		}else {
			noofspace--;
		}for(int j=0;j<count;j++) {
			System.out.print(" * ");
		}if(i<n) {
			count=count+2;
		}else {
			count=count-2;
	
		}System.out.println( );
	}
}}
