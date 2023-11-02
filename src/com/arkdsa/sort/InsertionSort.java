package com.arkdsa.sort;

public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arr= {6,8,4,7,5,1,12,45};
		InsertSortAlgo(arr);
	}

	private static void InsertSortAlgo(int[] arr) {
		for (int i = 1; i <= arr.length-1; i++) {
			int temp=arr[i];
			int j=i-1;
			while (j>=0 && arr[j] > temp) {
				arr[j+1]=arr[j];
				j--;
			}arr[j+1]=temp;
			
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		
		
	}

}
