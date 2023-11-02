package com.arkdsa.alternate;


public class primenumber {
     
	public static void main(String[] args) {
		 primeNumberCheck(67);
	}

	private static void primeNumberCheck(int i) {
		int j;
		for (j = 2; j < i; j++) {
			if (i%j == 0) {
				break;
			}
		}
		if (j==i) {
			System.out.println("Given number is a prime number ::"+j);
		}else {
			System.out.print("it's not a prime number cause divisible by ::"+j);
		}
		
	}
}
