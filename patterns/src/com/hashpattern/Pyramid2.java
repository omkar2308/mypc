package com.hashpattern;

public class Pyramid2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print(" # ");
			}
			System.out.println("");
		}
	}
}