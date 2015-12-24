package com.pbamotra.mainclass;

import com.pbamotra.basic.BinarySearch;
import com.pbamotra.ctci.arrays.CheckPalindromePermutation;
import com.pbamotra.ctci.arrays.CheckStringPermutation;
import com.pbamotra.ctci.arrays.CheckStringRotation;
import com.pbamotra.ctci.arrays.OneEditAway;
import com.pbamotra.ctci.arrays.RotateMatrix;
import com.pbamotra.ctci.arrays.StringCompress;
import com.pbamotra.ctci.arrays.URLify;
import com.pbamotra.ctci.arrays.UniqueStringChars;
import com.pbamotra.ctci.arrays.ZeroMatrix;
import com.pbamotra.eopi.arrays.ArbitraryPrecisionInteger;
import com.pbamotra.eopi.arrays.DeleteKey;
import com.pbamotra.eopi.arrays.DutchFlag;
import com.pbamotra.eopi.arrays.GenerateNextPermutation;
import com.pbamotra.eopi.arrays.GeneratePermutations;
import com.pbamotra.eopi.arrays.GeneratePrimes;
import com.pbamotra.eopi.arrays.LongestContinuousSameArray;
import com.pbamotra.eopi.arrays.RemoveDuplicates;
import com.pbamotra.eopi.arrays.Sqrt;
import com.pbamotra.eopi.arrays.StockProfit2Times;
import com.pbamotra.eopi.arrays.StockProfitOnce;
import com.pbamotra.eopi.trees.CheckBalancedBinaryTree;
import com.pbamotra.eopi.trees.CheckBinaryTreeSymmetric;
import com.pbamotra.eopi.trees.InOrderTraversal;
import com.pbamotra.eopi.trees.LevelOrderTraversal;
import com.pbamotra.eopi.trees.PostOrderTraversal;
import com.pbamotra.eopi.trees.PreOrderTraversal;
import com.pbamotra.eopi.trees.TreeSort;
import com.pbamotra.leetcode.arrays.FourSum;
import com.pbamotra.leetcode.arrays.InsertPosition;
import com.pbamotra.leetcode.arrays.MatrixSearch2D;
import com.pbamotra.leetcode.arrays.MaxProductSubarray;
import com.pbamotra.leetcode.arrays.MaxSumSubarray;
import com.pbamotra.leetcode.arrays.ThreeSum;

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
		
		// Leetcode 53: Max subset sum
		MaxSumSubarray mss = new MaxSumSubarray();
		
		// Leetcode 152: Max product subarray
		MaxProductSubarray mps = new MaxProductSubarray();
		
		// Level-Order traversal
		LevelOrderTraversal lot = new LevelOrderTraversal();
		
		// In-order traversal
		InOrderTraversal io = new InOrderTraversal();
		
		// BST Sort O(nlogn)
		TreeSort tso = new TreeSort();
		
		// Post-order traversal
		PostOrderTraversal pot = new PostOrderTraversal();
		
		// Pre-order traversal
		PreOrderTraversal prot = new PreOrderTraversal();
		
		// P10.1 Check Binary tree is balanced
		CheckBalancedBinaryTree cbbt = new CheckBalancedBinaryTree();
		
		// P10.2 Check Binary tree is symmetric
		CheckBinaryTreeSymmetric cbts = new CheckBinaryTreeSymmetric();
		
		
	}
}
