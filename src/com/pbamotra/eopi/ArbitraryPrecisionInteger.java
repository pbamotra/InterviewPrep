package com.pbamotra.eopi;

import java.util.List;

public class ArbitraryPrecisionInteger {
		
	public List<Integer> increment(List<Integer> number) {
		
		boolean carry = false;
		number.set(number.size() - 1, number.get(number.size() - 1) + 1);
		
		for(int i=number.size()-1; i>=0; i--) {
			int curr = number.get(i);
			
			if(carry) {
				curr++;
			}
			
			if(curr > 9) {
				number.set(i, curr%10);
				carry=true;
			} else {
				number.set(i, curr);
				carry = false;
			}
		}
		
		if(carry) {
			number.add(0, 1);
		}
		
		return number;
	}
}
