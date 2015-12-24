package com.pbamotra.mainclass;

import java.util.List;

import com.pbamotra.basic.BinarySearch;
import com.pbamotra.ctci.CheckPalindromePermutation;
import com.pbamotra.ctci.CheckStringPermutation;
import com.pbamotra.ctci.CheckStringRotation;
import com.pbamotra.ctci.OneEditAway;
import com.pbamotra.ctci.RotateMatrix;
import com.pbamotra.ctci.StringCompress;
import com.pbamotra.ctci.URLify;
import com.pbamotra.ctci.UniqueStringChars;
import com.pbamotra.ctci.ZeroMatrix;
import com.pbamotra.eopi.ArbitraryPrecisionInteger;
import com.pbamotra.eopi.DeleteKey;
import com.pbamotra.eopi.DutchFlag;
import com.pbamotra.eopi.GenerateNextPermutation;
import com.pbamotra.eopi.GeneratePermutations;
import com.pbamotra.eopi.GeneratePrimes;
import com.pbamotra.eopi.LongestContinuousSameArray;
import com.pbamotra.eopi.RemoveDuplicates;
import com.pbamotra.eopi.Sqrt;
import com.pbamotra.eopi.StockProfit2Times;
import com.pbamotra.eopi.StockProfitOnce;
import com.pbamotra.leetcode.FourSum;
import com.pbamotra.leetcode.InsertPosition;
import com.pbamotra.leetcode.MatrixSearch2D;
import com.pbamotra.leetcode.ThreeSum;

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
		
		// P6.1 Dutch Flag partition
		DutchFlag df = new DutchFlag();
		
		// P6.2 Arbitrary precision int increment
		ArbitraryPrecisionInteger api = new ArbitraryPrecisionInteger();
		
		// P6.5 Delete key from array
		DeleteKey dk = new DeleteKey();
		
		// P6.6 Remove duplicates
		RemoveDuplicates rdk = new RemoveDuplicates();
		
		// P6.7 Buy and sell stock once
		StockProfitOnce spo = new StockProfitOnce();
		
		// P6.7.1 Best subarray with equal elements
		LongestContinuousSameArray lcsa = new LongestContinuousSameArray();
		
		// SQRT
		Sqrt sqrt = new Sqrt();
		
		// P6.8 Buy and Sell 2x
		StockProfit2Times spnt = new StockProfit2Times();
		
		// P6.9 Generate N Prime number
		GeneratePrimes gp = new GeneratePrimes();
		
		// P6.10 Generate Permutations
		GeneratePermutations gps = new GeneratePermutations();
		
		// P6.11 Next Permutation
		GenerateNextPermutation gnp = new GenerateNextPermutation();
		
		// Basic 1: Binary search
		BinarySearch bs = new  BinarySearch();
		
		// Leetcode 15: 3Sum
		ThreeSum ts = new ThreeSum();
		
		// Leetcode 35: Insert position
		InsertPosition ip = new InsertPosition();
		
		// Leetcode 74: Matrix search 2-D
		MatrixSearch2D m2d = new MatrixSearch2D();
		
		// Leetcode 18: 4Sum
		FourSum fs = new FourSum();
		int[] nums = new int[] {1, 0 ,-1, 0, -2, 2};
		List<List<Integer>> lists = fs.find(nums, 0);
		for(List<Integer> list : lists) {
			System.out.println(list);
		}
	}
}
