package com.pbamotra.eopi.dp;

import com.pbamotra.utils.Utils;

public class Knapsack {
	public static void findBest(int[] sizes, int[] value, char[] names, int knapsackSize) {
		
		assert sizes.length == value.length;
		int n_item_types = sizes.length;
		
		int[] cost = new int[knapsackSize + 1];
		char[] best = new char[knapsackSize + 1];
		
		System.out.println(n_item_types + " " + knapsackSize);
		
		for(int j=1; j<=n_item_types; j++) {
			for(int i=1; i<=knapsackSize; i++) {
				if (i >= sizes[j - 1]) { // knapsack should have enough space to accommodate this item type j
					if(cost[i - sizes[j - 1]] + value[j - 1] > cost[i]) {
						cost[i] = cost[i - sizes[j - 1]] + value[j - 1];
						best[i] = names[j - 1];
					}
				}
			}
		}
		
		for(int i=Utils.min(sizes); i<best.length; i++) {
			System.out.print(best[i] + " ");
		}
	}
	
	/* public static void main(String[] args) {
		int[] sizes = new int[] {3, 4, 7, 8, 9};
		int[] value = new int[] {4, 5, 10, 11, 13};
		char[] names = new char[] {'A', 'B', 'C', 'D', 'E'};
		
		int knapsackSize = 17;
		
		findBest(sizes, value, names, knapsackSize);
	}*/
}
