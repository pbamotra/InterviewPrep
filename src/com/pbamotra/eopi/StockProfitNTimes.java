package com.pbamotra.eopi;

import java.util.ArrayList;
import java.util.List;

public class StockProfitNTimes {
	private class Interval {
		int buy;
		int sell;
		
		public void setBuy(int buy) {
			this.buy = buy;
		}

		public void setSell(int sell) {
			this.sell = sell;
		}
	}
	
	public void findSalePurchasePairs(int[] arr) {
		
		List<Interval> pairs = new ArrayList<>();
		
		assert pairs != null;
		int i = 0;
		int len = arr.length;
		int n_pairs = 0;
		
		while (i < len - 1) {
			while( (i < len - 1) && arr [i+1] <= arr[i])
				i++;
			
			if(i == len - 1)
				break;
			
			Interval iv = new Interval();
			iv.setBuy(i++);
			
			while( (i < len) && arr [i] >= arr [i-1]) 
				i++;
			
			iv.setSell(--i);
			
			pairs.add(iv);	
		}
		
		for(int j=0; j<n_pairs; j++) {
			System.out.println("Buy at " + pairs.get(j).buy + " and sell at " + pairs.get(j).sell);
		}
	}
}
