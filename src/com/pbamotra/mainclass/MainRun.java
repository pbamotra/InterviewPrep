package com.pbamotra.mainclass;

import com.pbamotra.ctci.CheckPalindromePermutation;
import com.pbamotra.ctci.CheckStringPermutation;
import com.pbamotra.ctci.CheckStringRotation;
import com.pbamotra.ctci.OneEditAway;
import com.pbamotra.ctci.RotateMatrix;
import com.pbamotra.ctci.StringCompress;
import com.pbamotra.ctci.URLify;
import com.pbamotra.ctci.UniqueStringChars;
import com.pbamotra.ctci.ZeroMatrix;

public class MainRun {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Q1.1 Check if a string has unique characters
		UniqueStringChars usc = new UniqueStringChars();
		
		// Q1.2 Check if two strings are permutations
		CheckStringPermutation csp = new CheckStringPermutation();
		
		// Q1.3 URLify
		URLify ufy = new URLify();
		
		// Q1.4 Check if Palindrome permutation
		CheckPalindromePermutation cpp = new CheckPalindromePermutation();
		
		// Q1.5 OneEditAway
		OneEditAway oea = new OneEditAway();
		
		// Q1.6 StringCompress
		StringCompress sc = new StringCompress();
		
		// Q1.7 Matrix Rotation
		RotateMatrix rm = new RotateMatrix();
		
		// Q1.8 Nullify matrix
		ZeroMatrix zm = new ZeroMatrix();
		
		// Q1.9 Check string rotation
		CheckStringRotation csr = new CheckStringRotation();
	}
}
