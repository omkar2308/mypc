package com.stringPatt;

public class StrPatt4 {
	public static void main(String[] args) {
		String input = "Do not disturb";
		int lenght = input.length();
		StringBuilder dest = new StringBuilder(lenght);
		for (int i = (lenght - 1); i >= 0; i--) {
			dest.append(input.charAt(i));
		}
		System.out.println(dest.toString());
	}
}
