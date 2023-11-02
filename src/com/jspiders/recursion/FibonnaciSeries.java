package com.jspiders.recursion;

public class FibonnaciSeries {
	
	public static void main(String[] args) {
		int n=8;
		System.out.println(finbo(n));;
	}

	private static int finbo(int n) {
        int j=n-1;
		if(j==0 ||j ==1) {
			return 1;
		}else {
			return (finbo(n-2)+finbo(n-1));
		}
	}
		


}
