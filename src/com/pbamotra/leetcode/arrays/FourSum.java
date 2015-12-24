package com.pbamotra.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	public List<List<Integer>> find(int[] nums, int target) {
		
		Arrays.sort(nums);
		Set<List<Integer>> hashset = new HashSet<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int len = nums.length;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				int k = j + 1;
				int l = len - 1;
				
				while(k < l) {
					int sum = nums[i] + nums[j] + nums[k] + nums[l];
					
					if(sum < target) k++;
					else if(sum > target) l--;
					else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						list.add(nums[l]);
						
						if(!hashset.contains(list)) {
							hashset.add(list);
							result.add(list);
						}
						
						k++;
						l--;
					}
				}
			}
		}
		
		return result;
	}
}
