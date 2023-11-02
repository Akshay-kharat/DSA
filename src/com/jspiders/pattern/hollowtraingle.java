package com.jspiders.pattern;

import java.util.Iterator;

public class hollowtraingle {
	public static void main(String[] args) {
		triangle();
		
	}

	private static void triangle() {
		System.out.println("start");
		 for (int i=5; i>= 1 ; i--)
         {
             for (int j = i; j < 5 ; j++) {
                 System.out.print("_");
             } 
			for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == 5 || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
			}
			System.out.println();
		}
		
	}

}
