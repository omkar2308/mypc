package com.stringPatt;

public class StrPatt3 {
	 public static void main(String[] args)
	    {
	        String input = "java by kiran";
	        char[] A1 = input.toCharArray();
	        int left, right=0;
	        right = A1.length-1;
	 
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = A1[left];
	            A1[left] = A1[right];
	            A1[right]=temp;
	        }
	 
	        for (char c : A1)
	            System.out.print(c);
	        System.out.println();
	    }

}
