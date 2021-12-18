package com.java.dp;

public class buyAndSell3 {

	public static int maxProfit(int[] prices) {
		int maxProfit1 = 0, mxProfit2 = 0;
		int curProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			System.out.print(curProfit+" ");
			if (prices[i] > prices[i - 1]) {
				curProfit += prices[i] - prices[i - 1];
			} else {
				/*
				 * if (curProfit > maxProfit1 && mxProfit2<=maxProfit1) maxProfit1 = curProfit;
				 * else if (curProfit > mxProfit2) mxProfit2 = curProfit;
				 */
				if (maxProfit1 < mxProfit2 && maxProfit1 < curProfit) {
					maxProfit1 = curProfit;
				} else if (mxProfit2 < curProfit) {
					mxProfit2 = curProfit;
				}
				curProfit = 0;
			}
		}
		System.out.println(curProfit);
		System.out.println(maxProfit1);
		System.out.println(mxProfit2);
		if(curProfit>maxProfit1 && maxProfit1 < mxProfit2) {
			maxProfit1 = curProfit;
		}else if(curProfit>mxProfit2) {
			mxProfit2 = curProfit;
		}
		System.out.println("after .....");
		System.out.println(maxProfit1);
		System.out.println(mxProfit2);
		return maxProfit1 + mxProfit2;
	}

	public static void main(String[] args) {

		int[] prices = {1,2,4,2,5,7,2,4,9,0};
		System.out.println("ans :"+maxProfit(prices));
	}

}
