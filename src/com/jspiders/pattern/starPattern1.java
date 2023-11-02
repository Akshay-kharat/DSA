package com.jspiders.pattern;

public class starPattern1 {
	
	public static void main(String[] args) {
		String string="neen",string2="";
		String scString =string.toUpperCase();
		System.out.println(scString);
		
		
		for (int i = scString.length()-1; i >= 0; i--) {
			string2= string2 + scString.charAt(i);
		}
		System.out.println(string2);
		if (string2.equals(scString) ) {
			System.out.println("string is palindrome "+string2);
		}else {
			System.out.println("string is not palindrome");
		}
		}

}
