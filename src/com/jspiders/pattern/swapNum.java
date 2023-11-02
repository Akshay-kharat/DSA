package com.jspiders.pattern;

public class swapNum {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+(b=a);
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
