package com.hashpattern;

import java.util.Scanner;

public class Ustarpatt {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int count =1;
		for(int i=0;i<n;i++) {
			
			for(int spc=n-i; spc>0;spc--) {
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}count=count=+2;
			System.out.println();
			}
	}
	}
	
