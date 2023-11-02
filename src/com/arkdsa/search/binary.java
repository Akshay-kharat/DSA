package com.arkdsa.search;

import java.util.Scanner;

public class binary {

	
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int [] arr= {12,14,18,16,18,20};
	int low=0,high=arr.length-1;
	
	int search=20;
	int num=BinarySearch(arr,low,high,search);
	if (num != -1) {
		System.out.println("Number found at index "+num);
	}else {
		System.out.println("number not found in array.....");
	}
}

private static int BinarySearch(int[] arr, int low, int high, int search) {
	if (low > high) {
		return-1;
	}
	 if (low<= high) {
		int mid = low + (high-low)/2;
		if (arr[mid] == search) {
			return mid;
		}if ( search < arr[mid]) {
			return BinarySearch(arr, low, mid-1, search);
		}else {
			return BinarySearch(arr, mid+1, high, search);
		}
	}
	return -1;
}
}
