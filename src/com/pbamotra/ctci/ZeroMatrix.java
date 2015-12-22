package com.pbamotra.ctci;

public class ZeroMatrix {
	public void nullifyMatrix(int[][] mat) {
		
		int nrow = mat.length;
		int ncol = mat[0].length;
		
		boolean[] nullrow = new boolean[ncol];
		boolean[] nullcol = new boolean[nrow];
		
		if(nrow != ncol) return;
		
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++) {
				if(mat[i][j] == 0) {
					nullrow[i] = true;
					nullcol[j] = true;
				}
			}
		}
		
		for(int i=0; i<nullrow.length; i++) {
			if(nullrow[i])
				nullifyRow(mat, i);
		}
		
		for(int i=0; i<nullcol.length; i++) {
			if(nullcol[i])
				nullifyCol(mat, i);
		}
		
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void nullifyRow(int[][] mat, int row) {
		for(int i=0; i<mat[0].length; i++) {
			mat[row][i] = 0;
		}
	}
	
	public void nullifyCol(int[][] mat, int col) {
		for(int i=0; i<mat.length; i++) {
			mat[i][col] = 0;
		}
	}
}
