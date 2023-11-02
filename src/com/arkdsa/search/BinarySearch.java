package com.arkdsa.search;

import java.util.Arrays;

import javax.naming.directory.SearchControls;
import javax.swing.text.Highlighter.Highlight;

public class BinarySearch {

	
	public static void main(String[] args) {
		int [] arr = {12,425,30,41,40,45,60};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		} 
		System.out.println();
		int min=0,max=arr.length,search=40;
		System.out.println(" you are searching for the element is "+search);
		int res=SearchElement(arr,min,max,search);
		if (res == -1) {
			System.out.println("Sorry element is not in given array");
		}else {
			System.out.println("Given array element is preset in the index of :::"+res);
		}
	}

	private static int SearchElement(int[] arr, int min, int max, int search) {
		if (min > max) {
			return -1;
		} if (min <= max) {
			int mid=min+(max-min)/2;
		if (arr[mid]==search) {
			return mid;
		}if (search< arr[mid]) {
			return SearchElement(arr, min, mid-1, search);
		}if (search > arr[mid]) {
			return SearchElement(arr, mid+1, max, search);
		} }
		
		return -1;
	}
}
