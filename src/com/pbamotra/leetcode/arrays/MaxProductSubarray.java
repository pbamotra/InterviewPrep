package com.pbamotra.leetcode.arrays;

public class MaxProductSubarray {
	public int findMaxProduct(int[] nums) {
		int len = nums.length;
		int maxLocal = nums[0];
		int minLocal = nums[0];
		int global = nums[0];
		
		for(int i=1; i<len; i++) {
			int temp = maxLocal;
			maxLocal = Math.max(Math.max(maxLocal * nums[i], nums[i]), nums[i] * minLocal);
			minLocal = Math.min(Math.min(temp * nums[i], nums[i]), nums[i] * minLocal);
			global = Math.max(global, maxLocal);
		}
		
		return global;
	}
}
