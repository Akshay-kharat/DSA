package com.jspiders.pattern;

import java.util.Iterator;

public class NumberPatterrn {
	public static void main(String[] args) {
//		numpaett(5);
		numpaett2(5);
	}

	private static void numpaett2(int num) {
		System.out.println("start");
		for (int i = 0; i < num; i++) {
			for (int j = 2; j <= i ; j--) {
				System.out.print("_");
			}
		}
		
	}

	private static void numpaett(int num) {
        int num1=1;
		for (int i = 0; i < num; i++) {
		  for (int j = 0; j <= i; j++) {
			System.out.print(num1++ +" ");
		}System.out.println();	
		}
	}
	
	

}
