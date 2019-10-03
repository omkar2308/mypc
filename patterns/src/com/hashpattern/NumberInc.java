package com.hashpattern;

import java.util.Scanner;

public class NumberInc {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		int count=1;
		int noofspace=1;
		int start=0;
		for(int i=1;i<(n*2);i++){
			for(int spc=n-noofspace; spc>0;spc--) {
				System.out.print(" ");
			}if (i<n) {
				start =i;
				noofspace++;
			}else {
				start =n*2-i;
				noofspace--;
			}
				
			for(int j=0;j<count;j++) {
				System.out.print(start);
				if(j<count/2) {
					start--;
				}else {
					start++;
					}
			}if(i<n) {
				count=count+2;
			}else {
				count=count-2;
				}System.out.println();
}}
}