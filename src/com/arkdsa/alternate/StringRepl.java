package com.arkdsa.alternate;

public class StringRepl {
 
	public static void main(String[] args) {
		String str="string_kabab_singh";
		String replace = str.replace("_", "-");
		System.out.println(replace+" "+str);
	}
}
