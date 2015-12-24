package com.pbamotra.eopi.arrays;

import java.util.Collections;
import java.util.List;

public class DutchFlag {
	static void partition(int p, List<Integer> arr) {

		int small = 0, large = arr.size() - 1;
		int pivot = p;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < pivot) {
				Collections.swap(arr, small++, i);
			}
		}

		for (int i = arr.size() - 1; i >= 0
				&& arr.get(i) >= pivot; i--) {
			if (arr.get(i) > pivot) {
				Collections.swap(arr, large--, i);
			}
		}

		int n = arr.size();
		int i = 0;
		
		System.out.println("After Partitiion");
		while (i < n && arr.get(i) < pivot) {
			System.out.print(arr.get(i) + " ");
			++i;
		}
		while (i < n && arr.get(i) == pivot) {
			System.out.print(arr.get(i) + " ");
			++i;
		}
		while (i < n && arr.get(i) > pivot) {
			System.out.print(arr.get(i) + " ");
			++i;
		}
	}
}
