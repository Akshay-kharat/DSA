package com.jspiders.pattern;

public class starPattern {
	public static void main(String[] args) {
		System.out.println("start");
		starPrint();
	}

	private static void starPrint() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			for (int j = 5; j >= 1; j--) {
				if (j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for (int j = 1; j <i  ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println("end");
		
	}

}
