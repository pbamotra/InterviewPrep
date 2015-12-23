package com.pbamotra.eopi;

public class GenerateNextPermutation {
	public void nextPermutation(int[] permutation) {
		if(permutation == null || permutation.length == 0) return;
		
		int len = permutation.length;
		int p=0, q=0;
		
		for(int i=len-2; i>=0; i--) {
			if(permutation[i] < permutation[i+1]) {
				p=i;
				break;
			}
		}
		
		for(int i=len-2; i>p; i--) {
			if(permutation[i] > permutation[p]) {
				q=i;
				break;
			}
		}
		
		if(p == 0 && q==0) {
			reverse(permutation, 0, len - 1);
		}
		
		int temp = permutation[p];
		permutation[p] = permutation[q];
		permutation[q] = temp;
		
		if(p < len - 1) {
			reverse(permutation, p + 1, len - 1);
		}
	}
	
	public void reverse(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];;
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
