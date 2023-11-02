package com.arkdsa.search;

import java.util.HashMap;

public class CharCountFromString {
	
	public static void main(String[] args) {
		getChar("java programming is best");
	}
     
	private static void getChar(String string) {
		HashMap<Character, Integer> hashMap=new HashMap<>();
		//replace blank space
		string= string.replace(" ", "");
		char[] charArray = string.toCharArray();
		
		for (char c : charArray) {
			
			if (hashMap.containsKey(c)) {
				
				hashMap.put(c, hashMap.get(c)+1);
			//	System.out.println( c+" "+hashMap.get(c));
			}else {
				
				hashMap.put(c, 1);
				// ///System.out.println( c+" "+hashMap.get(c));
			}
		}
		 System.out.println("Count :" +hashMap);
		
	}

}
