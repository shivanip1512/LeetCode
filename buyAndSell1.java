package com.java.dp;

public class buyAndSell1 {

	public static int maxProfit(int k, int[] prices) {
		int minSoFar = prices[0];
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<minSoFar) {
				minSoFar = prices[i];
			}
			if(prices[i]-minSoFar>maxProfit) {
				maxProfit = prices[i]-minSoFar;
			}
			System.out.println(minSoFar+" "+maxProfit);
		}

		return maxProfit;
	}

	public static void main(String[] args) {

		int k = 1;
		int[] prices = { 2, 4, 12, 8, 6, 5, 9 };
		System.out.println(maxProfit(k, prices));
	}

}
