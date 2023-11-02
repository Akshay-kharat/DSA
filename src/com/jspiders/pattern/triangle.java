package com.jspiders.pattern;

public class triangle {
	public static void main(String[] args) {
		downtriangle();
		
	}

	private static void downtriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i ; j--) {
				System.out.print("_");
			}
			for (int j = 1; j <= (2*(i)-1); j++) {
				if (j==1 || j==((2*i)-1)) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
			
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5; j > i ; j--) {
				System.out.print("_");
			}
			for (int j = 1; j <= (2*(i)-1); j++) {
				if (j==1 || j==((2*i)-1)) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
			
		}
		
	}

}
