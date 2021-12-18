package com.java.dp;

public class buyAndSell2 {

	public static int maxProfit(int[] prices) {
		int maxProfit=0;

		for(int i=1;i<prices.length;i++) {
			int priceDiff = prices[i]-prices[i-1];
			if(priceDiff>0) {
				maxProfit += priceDiff;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {

		int[] prices = { 2, 4, 12, 8, 6, 5, 9 };
		System.out.println(maxProfit(prices));
	}

}
