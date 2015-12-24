package com.pbamotra.eopi;

public class StockProfit2Times {
	public int maxProfit(int[] prices) {
	        
	        int n_prices = prices.length;
	        int[] forward_pass  = new int[n_prices];
	        
	        int min_price_sofar = Integer.MAX_VALUE;
	        int max_price_sofar = Integer.MIN_VALUE;
	        int max_profit      = 0;
	        
	        for(int i=0; i<n_prices; i++) {
	            min_price_sofar = Math.min(min_price_sofar, prices[i]);
	            max_profit = Math.max(max_profit, prices[i] - min_price_sofar);
	            forward_pass[i] = max_profit;
	        }
	        
	        for(int i=n_prices-1; i>0 ; i--) {
	            max_price_sofar = Math.max(max_price_sofar, prices[i]);
	            max_profit = Math.max(max_profit, max_price_sofar - prices[i] + forward_pass[i - 1]);
	        }
	        
	        return max_profit;
	    }
}
