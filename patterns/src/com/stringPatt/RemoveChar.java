package com.stringPatt;

public class RemoveChar {
	public static void main(String[] args) {
		String input=new String("abc");
		String outpue=new String();
		for (int i=0;i<input.length();i++) {
			for (int j=0;j<outpue.length();j++) {
				if (input.charAt(i)!=outpue.charAt(i)) {
					outpue=outpue+input.charAt(i);
					
				}
			}
			
		}System.out.println(outpue);
	}

}
