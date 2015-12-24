package com.pbamotra.eopi.arrays;

public class StockProfitOnce {
	public int maxProfit(int[] arr) {
		int min_price_till_today = Integer.MAX_VALUE;
		int max_profit = 0;
		
		for(int today_price : arr) {
			int profit_today = today_price - min_price_till_today;
			max_profit = Math.max(profit_today, max_profit);
			min_price_till_today = Math.min(min_price_till_today, today_price);
		}
		
		return max_profit;
	}
}
