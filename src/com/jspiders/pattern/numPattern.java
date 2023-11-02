package com.jspiders.pattern;

import java.util.Iterator;

public class numPattern {
	
	
	public static void main(String[] args) {
		numuric();
	}

	private static void numuric() {
		for (int row = 1; row <= 4; row++) {
			for (int i = 1; i <= 4-row; i++) {
				System.out.print("  ");
			}
			for (int i = 1; i <= row; i++) {
				System.out.print((char)(64+i)+" ");
			}for (int i = 1; i <= row-1 ; i++) {
				System.out.print((char)(64+i)+" ");
			} System.out.println();
		}
		
	}

}
