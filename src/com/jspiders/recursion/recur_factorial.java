package com.jspiders.recursion;


public class recur_factorial {
	
	public static void main(String[] args) {
		int m=Factory(-5);
		if(m==-1) {
			System.out.println(" U entered -ve number.....!!");
		}else {
			System.out.println("factorial of given number is :"+m);
		}
	}

	private static int Factory(int i) {
		if (i<0) {
			return -1;
		}else if (i==0) {
			return 1;
		}else if (i>0) {
			return i*Factory(i-1);
		}
		return i;
	}

}
