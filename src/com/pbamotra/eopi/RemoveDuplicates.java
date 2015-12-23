package com.pbamotra.eopi;

public class RemoveDuplicates {
	public void unique(int[] arr) {
		int writepos = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[writepos - 1] != arr[i]) {
				arr[writepos++] = arr[i];
			}
		}
		
		for(int i=0; i<writepos; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
