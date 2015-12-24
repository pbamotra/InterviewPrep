package com.pbamotra.eopi.arrays;

public class DeleteKey {
	public int delete(int[] arr, int key) {
		
		int writepos = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != key) {
				arr[writepos++] = arr[i];
			}
		}
		
		return writepos;
	}
}
