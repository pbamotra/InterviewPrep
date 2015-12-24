package com.pbamotra.basic;

public class CountIslands {	
	private int m;
	private int n;
	private int matrix[][];
	private boolean visited[][];
	
	CountIslands(int matrix[][], int m, int n) {
		this.matrix = matrix; this.m = m; this.n = n;
		
		visited = new boolean[m][n];
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				visited[i][j] = false;
	}
	
	private boolean canMove(int i, int j, int v){
		if (i<0 || j<0 || i>=m || j>=n) return false;
		if ((!isVisited(i,j)) &&  v==matrix[i][j])
			return true;
		return false;
	}
	
	private void DFS(int i, int j, int v){
		if (canMove(i,j, v)){
			visited[i][j] = true;
			
			DFS(i-1,j, v); // up
			DFS(i+1,j, v); // down
			DFS(i,j-1, v); // left
			DFS(i,j+1, v); // right
		}
	};
	
	private boolean isVisited(int i, int j) {
		return visited[i][j];
	}
	public int getCountryNumber(){
		int count = 0;
		for (int i=0; i<m; i++)
			for (int j=0; j<n; j++)
				if (!isVisited(i,j)){
					count ++;
					DFS(i,j, matrix[i][j]);
				}
	
		return count;		
	}	
}