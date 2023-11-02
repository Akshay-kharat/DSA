package com.arkdsa.search;

import java.util.Scanner;

public class RevNum {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to be reverse ");
		int x=scanner.nextInt();
		
		int y =reverse(x);
		if (y==x) {
			System.out.println("Number is palindrome");
		} else {
            System.out.println("Number is not palindrome");
		}
	}

	private static int reverse(int x) {
		int y=x,rev=0,mod;
		while (y>0) {
			mod=y%10;
			rev=rev*10+mod;
			y=y/10;
		}
		return rev;
	}

}
