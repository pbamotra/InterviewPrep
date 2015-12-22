package com.pbamotra.ctci;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class UniqueStringChars {
	public boolean isUnique(String str) {
		
		if(str == null || str.isEmpty() || str.trim().isEmpty()) return true;
		if(str.trim().length() == 1) return true;
		
		char[] strArr = str.toCharArray();
		
		int[] ordArr = new int[128];
		for (char c : strArr) {
			if(ordArr[c] > 0) return false;
			ordArr[c] = 1;
		}
		
		return true;
	}
	
	public boolean isUnique2(String str) {
		
		for(char c : str.toCharArray()) {
			if(str.indexOf(c) != str.lastIndexOf(c)) return false;
		}
		
		return true;
	}
	
	public boolean isUnique3(String str) {
		if(str == null || str.trim().isEmpty()) return false;
		
		BitSet bs = new BitSet(1024);
		for (char c : str.toCharArray()) {
			if(!bs.get(c)) {
				bs.set(c);
			} else {
				return false;
			}
		}	
		return true;
	}
	
	public boolean isUnique4(String str) {
		
		Map<Character, Integer> hmap = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(hmap.get(c) != null) return false;
			hmap.put(c, 1);
		}
		return true;
	}
}
