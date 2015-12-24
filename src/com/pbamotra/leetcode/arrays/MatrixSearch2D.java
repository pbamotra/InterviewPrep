package com.pbamotra.leetcode.arrays;

public class MatrixSearch2D {
	private boolean binSearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target)
				return true;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}

		return false;
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int n_row = matrix.length;

		for (int i = 0; i < n_row; i++) {
			if (binSearch(matrix[i], target)) {
				return true;
			}
		}

		return false;
	}

}
