package com.pbamotra.leetcode.arrays;

public class MaxSumSubarray {
	public int findMaxSum(int[] nums) {
		int newsum = nums[0];
		int maxsum = nums[0];
		for(int i=1; i<nums.length; i++) {
			newsum = Math.max(newsum + nums[i], nums[i]);
			maxsum = Math.max(maxsum, newsum);
		}
		return maxsum;
	}
}
