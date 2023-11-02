package com.jspider.basic_java;

public class method extends newmethod{
	public static String methodCall() {
		System.out.println("Returning empty String");
		return "";
	}
	 public method() {
		 System.out.println("this is a constructor");
	 }
	
	public static void main(String[] args) {
		methodCall();
		method method=new method();
		newmethod newmethod=new method();
		method method2=(method)new newmethod();
	}

}
 class newmethod{
	public static void newcomer() {
		System.out.println("this is new commer class");
	}
}
