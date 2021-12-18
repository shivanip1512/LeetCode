package com.java.dp;

public class buyAndSellK {

	public static int maxProfit(int k, int[] prices) {
		
	     if(prices.length==0)
	            return 0;

		int[][] dp = new int[k + 1][prices.length];

		for (int t = 1; t <= k; t++) {
			int max = -prices[0];
			for (int d = 1; d < prices.length; d++) {

				int noTxn = dp[t][d - 1];
				max = maxValue(max, dp[t - 1][d - 1] - prices[d - 1]);
				dp[t][d] = maxValue(max + prices[d], noTxn);

				/*
				 * if (max + prices[d] > dp[t][d - 1]) { dp[t][d] = max + prices[d]; } else {
				 * dp[t][d] = dp[t][d - 1]; }
				 * 
				 * if (dp[t - 1][d - 1] - prices[d - 1] > max) { max = dp[t - 1][d - 1] -
				 * prices[d - 1]; }
				 */

//				System.out.print("dp[" + t + "][" + d + "] :" + dp[t][d]);

				System.out.print(dp[t][d] + "\t");
			}
			System.out.println();
		}

		return dp[k][prices.length - 1];
	}

	private static int maxValue(int max, int i) {
		return max > i ? max : i;
	}

	public static void main(String[] args) {

		int k = 4;
		int[] prices = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
		System.out.println(maxProfit(k, prices));
	}

}
