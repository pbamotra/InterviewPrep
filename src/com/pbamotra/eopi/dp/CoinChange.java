package com.pbamotra.eopi.dp;

public class CoinChange {
	public void change(int[] D, int m, int n) {
		int[] C = new int[n + 1];
		int[] S = new int[n + 1];
		
		for(int i=1; i<=n; i++) {
			int min  = Integer.MAX_VALUE;
			int coin = -1;
			for(int j=0; j<m; j++) {
				if(i >= D[j]) {
					if(C[i - D[j]] + 1 < min) {
						min = C[i - D[j]] + 1;
						coin = D[j];
					}
				}
			}
			C[i] = min;
			S[i] = coin;
		}
		
		System.out.println(C[n]);
	}
	
	/*public static void main(String[] args) {
		int[] denominations = {1, 3, 4};
		int target = 100;
		
		change(denominations, denominations.length, target);
	}*/
}
