package com.pbamotra.eopi;

public class LongestContinuousSameArray {
	public void findLongestSubarray(int[] arr) {
		int bestNum = arr[0], bestFreq = 0;
		int freq = 1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				freq++;
			} else {
				if(freq > bestFreq) {
					bestNum = arr[i-1];
					bestFreq = freq;
				}
				freq = 1;
			}
		}
		
		if(freq > bestFreq) {
			bestNum = arr[arr.length - 1];
			bestFreq = freq;
		}
		
		System.out.println(bestNum + " occurs " + bestFreq + " times continuosly");
	}
}
