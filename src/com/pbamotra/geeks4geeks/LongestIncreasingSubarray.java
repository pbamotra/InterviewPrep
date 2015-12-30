package com.pbamotra.geeks4geeks;

import com.pbamotra.utils.Utils;


public class LongestIncreasingSubarray {
	public void findLen(int[] arr) {
		int[] lis = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			lis[i] = 1;
		}
		
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
			}
		
		System.out.println(Utils.max(lis));
	}
	
	/*public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		findLen(arr);
	}*/
}
