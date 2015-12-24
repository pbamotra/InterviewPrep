package com.pbamotra.ctci.arrays;

public class CheckStringPermutation {
	public boolean isPermutation(String str1, String str2) {
		
		if(str1 == null || str2 == null || str1.trim().isEmpty() || str2.trim().isEmpty()) return false;
		if(str1.length() != str2.length()) return false;
		
		int[] track = new int[128];
		
		for(char c : str1.toCharArray()) {
			track[c] += 1;
		}
		
		for(char c: str2.toCharArray()) {
			track[c] --;
		}
		
		for(int i: track) {
			if(i != 0) return false;
		}
		
		return true;
	}
}
