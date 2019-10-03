package com.stringPatt;

public class StrPatt2 {
	public static void main(String[] args)
    {
        String input = "java by kiran";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }

}
