package com.pbamotra.ctci.arrays;

public class CheckStringRotation {

	public boolean isRotation(String str1, String str2) {
		return str1.concat(str1).contains(str2);
	}

}
