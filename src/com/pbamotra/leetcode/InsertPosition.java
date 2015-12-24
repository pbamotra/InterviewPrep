package com.pbamotra.leetcode;

public class InsertPosition {
	public int search(int[] A, int target,int start, int end) {

		int mid = (start + end) / 2;

		if (target == A[mid]) return mid;
		else if (target < A[mid]) return start < mid ? search(A, target, start, mid - 1) : start;
		else return end > mid ? search(A, target, mid + 1, end) : (end + 1);

	}
}
