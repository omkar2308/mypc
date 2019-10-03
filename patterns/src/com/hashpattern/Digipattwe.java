package com.hashpattern;

public class Digipattwe {
	public static void main(String[] args) {
		
		int sp=4;
		for (int i=1;i<=5;i++) {			
		for(int j=1;j<=sp;j++) 
			System.out.print(" ");
		for(int k=1;k<=i;k++) 
			System.out.print(k);
			
		for(int m=i-1;i>=1;i--) 
			System.out.print(m);
		System.out.println();
		sp--;
		
		}
	}}


