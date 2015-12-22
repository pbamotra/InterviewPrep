package com.pbamotra.ctci;

public class RotateMatrix {
	public void rotate(int[][] mat) {
		int nrow = mat.length;
		int ncol = mat[0].length;
		
		if(nrow != ncol) return;
		
		for (int i = 0; i < nrow; i++) {
			for (int j = i+1; j < ncol; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		for (int i = 0; i < ncol/2; i++) {
			for (int j = 0; j < nrow; j++) {
				int temp = mat[j][i];
				mat[j][i] = mat[j][ncol - i - 1];
				mat[j][ncol - i - 1] = temp;
			}
		}
		
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
