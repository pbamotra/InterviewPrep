package com.pbamotra.basic;

import java.util.Arrays;

public class BinarySearch {
	public int search(int[] nums, int key, boolean isSorted) {

		int low = 0;
		int high = nums.length - 1;
		
		if(!isSorted)
			Arrays.sort(nums);
		
		while(low <= high) {
			int mid = low + (high - low) /2;
			if(nums[mid] == key) return mid;
			else if(nums[mid] > key)high = mid - 1;
			else low = mid + 1;
		}
		
		return -1;
	}
	
	public int search2(int[] A, int target,int start, int end) {
		int mid = (start + end) / 2;
		if(end < start) return -1;
		if (target == A[mid])
			return mid;
		else if (target < A[mid])
			return search2(A, target, start, mid - 1);
		else
			return search2(A, target, mid + 1, end);

	}
}
