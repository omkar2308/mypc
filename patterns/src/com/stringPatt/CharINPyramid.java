package com.stringPatt;

public class CharINPyramid {
	public static void main(String[] args) {
		
		char s[]=new char[] {'A','L','L','H','A','B'};
		int a=s.length;
		int b=0;
		for(int i=0;i<=a;i++){
			for(int j=8;j>b;j--) {
				System.out.print("");
			}b++;
			for(int j=0;j<i;j++) {
				System.out.print(""+s[j]);
			}
			System.out.println("");
		}
		
				
		
	}

}
