package com.pbamotra.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> findTriplets(int[] nums) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		int len = nums.length;
		if(len < 3) return result;
		
		Arrays.sort(nums);
		for(int i=0; i<len-2; i++) {
			if(i == 0 || nums[i] > nums[i - 1]) {
				int negate = -nums[i];
				int start = i + 1;
				int end = len - 1;
				
				while(start < end) {
					if((nums[start] + nums[end]) < negate)
						start++;
					else if((nums[start] + nums[end]) > negate)
						end--;
					else {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[i]);
						temp.add(nums[start]);
						temp.add(nums[end]);
						
						result.add(temp);
						
						start++; end--;
						while((start < end) && nums[end] == nums[end+1])
							end--;
						while((start < end) && nums[start] == nums[start-1])
							start++;
						
					}
				}
			}
		}
		
		return result;
		
	}
}
