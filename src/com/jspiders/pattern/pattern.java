package com.jspiders.pattern;

public class pattern {
	
	public static void main(String[] args) {
		leftTriangle();
		System.out.println("-------------------------------");
		leftReverseTriangle();
		System.out.println("********************************");
		TwoINOne();
		
	}

	private static void TwoINOne() {
		
			for (int i1 = 1; i1 <= 5 ; i1++) {
				for (int j = 1; j <= i1 ; j++) {
					System.out.print("* ");
				}System.out.println();
			}
			for (int i1 = 4; i1 >= 1  ; i1--) {
				for (int j = 1; j <= i1; j++) {
					System.out.print("* ");
				}System.out.println();
			}
		}
		
	

	private static void leftReverseTriangle() {
		for (int i = 5; i >= 1  ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	}

	private static void leftTriangle() {
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	}

}
