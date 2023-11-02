package com.jspiders.recursion;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter number::");
		int num=scanner.nextInt();
		System.out.println(rec(num));
	}

	private static int rec(int i) {
		if (i<0) {
			return -1;
		}
		if (i==0) {
			return 1;
		}else {
			System.out.println(i);
			return i*rec(i-1);
		}		
	}

}
