package com.stringPatt;

public class StrPatt1 {
	 public static void main(String[] args)
	    {
	        String input = "OMAKR";
	 
	        // getBytes() method to convert string 
	        // into bytes[].
	        byte [] array = input.getBytes();
	 
	        byte [] result = new byte [array.length];
	 
	        // Store result in reverse order into the
	        // result byte[]
	        for (int i = 0; i<array.length; i++)
	            
	        	result[i] =array[array.length-i-1];
	 
	        System.out.println(new String(result));
	    }
}
