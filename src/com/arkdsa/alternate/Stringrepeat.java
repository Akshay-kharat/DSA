package com.arkdsa.alternate;

public class Stringrepeat {
	
	public static void main(String[] args) {
		String str="Amar";
		System.out.println(stringrepeCheck(str,3));;
	}

	private static String stringrepeCheck(String str,int num) {
		System.out.println("calling");
		String result="";
		int count=1;
		while(count<=num) {
			result=result+str;
			count++;
		}
		return result;
	}

}
