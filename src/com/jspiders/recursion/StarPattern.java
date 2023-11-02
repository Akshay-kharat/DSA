package com.jspiders.recursion;

public class StarPattern {
	
	public static void main(String[] args) {
		StarPattern();
	}

	private static void StarPattern() {
		for (int row = 0; row < 4; row++) {
			for (int sp = 6; sp > row; sp--) {
				System.out.print(" ");
			}for (int st = 0; st <= row; st++) {
				System.out.print("* ");
			}System.out.println();
		}for (int row = 0; row < 4; row++) {
			for (int sp = 3; sp > row; sp--) {
				System.out.print(" ");
			}for (int st = 0; st <= row; st++) {
				System.out.print("* ");
			}for (int sp = 3; sp > row; sp--) {
				System.out.print("  ");
			}for (int st = 0; st <= row; st++) {
				System.out.print("* ");
			}System.out.println();
			}
		
	}

}
