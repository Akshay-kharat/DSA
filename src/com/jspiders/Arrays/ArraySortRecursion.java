package com.jspiders.Arrays;


public class ArraySortRecursion {
	
	
	public static boolean isArraySortRecursion (int [] arr, int max) {
		if (max == 1 || max<1) {
			return true;
		}
		return (arr[max-2] > arr[max-1]) ? false: isArraySortRecursion(arr, max-1);
	}
	
	private static boolean isArraySort(int[] arr, int max) {
          if (max==0 || max==1){
			return true;
		}if (arr[max-2] > arr[max-1]) {
			return false;
		}
		boolean boll=isArraySort(arr, max-1);
		return boll;
	}

	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int max=arr.length;
		System.out.print("Array is sorted :::");
		System.out.print(isArraySortRecursion(arr,max)+"::::");
		int a=2;
		int b=++a*++a*++a;
		System.out.println(b);
	}

	
}
