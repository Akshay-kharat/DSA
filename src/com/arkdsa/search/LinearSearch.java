package com.arkdsa.search;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size ");
		int num;
//		int [] arr= new int[num];
//		for (int i=0 ; i<arr.length; i++) {
//			arr[i]=scanner.nextInt();
//		}
//		Arrays.sort(arr);
//		System.out.println("entered array is");
//		for (int i : arr) {
//			System.out.println(i+" ");
//		}
		int [] arr= {12,25,45,65,43};
		Arrays.sort(arr);
		 num =LinearFind(arr,45);
		if (num == -1) {
			System.out.println("Enter number is not found..");
		}
		System.out.println("Number is found at index "+num+" is "+arr[num]);
	}

	private static int LinearFind(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				return j;
			}
			
		}
		return -1;
	}

}
