package com.arkdsa.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int [] arr = {12,25,4,78,95,25};
		BubbleSort(arr);
	}

	private static void BubbleSort(int[] arr) {
		int temp,flag = 0;
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 1; j <= arr.length-1-i; j++) {
				if (arr[j] < arr[j-1]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					flag=1;
				}
	}//if (flag == 0) {
//				break;
//			}
			
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
