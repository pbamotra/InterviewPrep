package com.pbamotra.eopi.dp;

public class LongestIncreasingSubsequence {
	public static void find(int[] arr) {
		
		assert arr.length > 0;
		
		int N = arr.length;
		int[] opt = new int[N];
		
		opt[0]    = arr[0];
		int start = 0, end = 0;
		
		int t      = 0;
		int max   = arr[0];
		
		for(int i=1; i<N; i++) {
			if(opt[i-1] > 0) {
				opt[i] = opt[i-1] + arr[i];
			} else {
				opt[i] = arr[i];
				t=i;
			}
			
			if(opt[i] > max) {
				max    = opt[i];
				start  = t;
				end    = i;
			}
		}
		
		System.out.println("Start at " + (start + 1) + " & end at " + (end + 1) + " with max sum of " + opt[end]);	
	}
	
	/*public static void main(String[] args) {
		int[] arr = new int[] {5, -6, 7, 12, -3, 0, -11, -6};
		find(arr);
	}*/
}
