package com.jspiders.Arrays;

public class maximumNum {
	public static void main(String[] args) {
		int [] arr= {4,12,20,30,45};
		int max=Integer.MIN_VALUE;
		System.out.println("Maximum value is::"+max);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] > max);
			if (arr[i] > max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum value from given array is ::"+max);
		
	}

}
