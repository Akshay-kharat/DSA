package com.arkdsa.search;

import com.jspiders.pattern.multipleCatch;

public class MatrixMulti {
	
	public static void main(String[] args) {
		int [] [] a1= {{1,1,1}, {2,2,2}, {3,3,3}};
		int [] [] a2= {{1,1,1}, {2,2,2}, {3,3,3}};
		int [] [] a3= multi(a1,a2) ;
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3.length; j++) {
				System.out.print(a3[i][j]+" ");
			}System.out.println();
		}
	}

	private static int[][] multi(int[][] a1, int[][] a2) {
		int [][] a3=new int[3][3];
		int k;
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3.length; j++) {
				a3[i][j]=0;
				for(k=0 ; k<3; k++) {
					a3[i][j]= a3[i][j] + a1[i][k] * a2[k][j];
				}
			}
		}
		return a3;
	}

}
