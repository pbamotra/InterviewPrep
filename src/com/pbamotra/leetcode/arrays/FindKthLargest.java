package com.pbamotra.leetcode.arrays;

public class FindKthLargest {
	public  int find(int[] nums, int k) {
		
		if (k < 1 || k > nums.length)
			return Integer.MAX_VALUE;
		return findKth(nums, 0, nums.length - 1, nums.length - k + 1);
	}
	
	public  int findKth(int[] nums, int start, int end, int k) {
		
		int pivot = nums[end];
		int left = start, right = end;
		
		while(true) {
			while(left < right && nums[left] < pivot)
				left++;
			while(left < right && nums[right] >= pivot)
				right--;
			if(left == right)
				break;
			swap(nums, left, right);
		}
		
		swap(nums, left, end);
		if(left == k-1)
			return nums[left];
		else if (left > k-1)
			return findKth(nums, start, left - 1, k);
		
		return findKth(nums, left + 1, end, k);
	}
	
	public  void swap(int[] nums, int i1, int i2) {
		int temp = nums[i1];
		nums[i1] = nums[i2];
		nums[i2] = temp;
	}
	
	/*public static void main(String[] args) {
		int[] nums = new int[] {4,1,5,3,2,0};
		System.out.println(find(nums, 4));
	}*/
}
