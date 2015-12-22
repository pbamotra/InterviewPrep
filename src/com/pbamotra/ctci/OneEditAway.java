package com.pbamotra.ctci;

public class OneEditAway {
	public boolean checkOneEditAway(String str1, String str2) {
		if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) return false;
		
		if(str1.length() == str2.length()) return checkReplace(str1, str2);
		if(str1.length() + 1 == str2.length()) return checkInsert(str1, str2);
		if(str1.length() - 1 == str2.length()) return checkInsert(str2, str1);
		
		return false;
	}

	private boolean checkReplace(String str1, String str2) {
		boolean once_differ = false;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				if(once_differ) return false;
				once_differ = true;
			}
		}
		
		return true;
	}

	private boolean checkInsert(String str1, String str2) {
		int i =0, j=0;
		while(j<str2.length() && i<str1.length()) {
			if(str1.charAt(i) == str2.charAt(j)) {
				i++; j++;
			} else {
				if(i!=j) return false;
				j++;
			}
		}
		
		return true;
	}
	
	
}
