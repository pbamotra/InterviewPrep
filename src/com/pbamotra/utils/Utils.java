package com.pbamotra.utils;

import com.pbamotra.datastructures.ListNode;

public class Utils {
	public static int min(int[] arr) {
		if(arr.length == 0) throw new IllegalArgumentException("Invalid argument passed");
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int max(int[] arr) {
		if(arr.length == 0) throw new IllegalArgumentException("Invalid argument passed");
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static <T> void printList(ListNode<T> head) {
		ListNode<T> dummy = head;
		while(dummy != null) {
			System.out.print(dummy.value + " ");
			dummy = dummy.next;
		}
	}
}
