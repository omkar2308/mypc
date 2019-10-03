package logicalAssignment;

import java.util.Scanner;
import java.util.Random;

public class RandamNumber {
	public static void main(String[] args) {
		
	
	int MaxRange;
	Scanner sc=new Scanner(System.in);
	
	Random rand =new Random();
	System.out.println("enter max range ");
	MaxRange=sc.nextInt();
	
	for (int i=1;i<=50;i++) {
		System.out.println(rand.nextInt(MaxRange));
	}
	
	
	}
}
