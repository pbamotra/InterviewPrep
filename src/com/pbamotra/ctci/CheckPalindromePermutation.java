package com.pbamotra.ctci;

import java.util.BitSet;

public class CheckPalindromePermutation {
	
	int getVal(char c) {
		
		int retVal = -1;
		if((int)'a' <= c && c <= (int)'z') retVal = c - 'a';
		if((int)'A' <= c && c <= (int)'Z') retVal = c - 'A';
		
		return retVal;
	}
	
	public boolean check(String str) {
		BitSet bs = new BitSet(26);
		
		for(char c:str.toCharArray()) {
			
			int val = getVal(c);
			if(val == -1) continue;
			if(bs.get(val)) {
				bs.flip(val);
			} else {
				bs.set(val);
			}
		}
		
		if(bs.isEmpty() || bs.cardinality() == 1) return true;
		return false;
	}
}
