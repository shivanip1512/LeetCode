package com.java.dp;

public class rainWater {

	public static void main(String[] args) {
		int[] levels = { 2, 0, 4, 1, 3, 0, 2, 1, 0, 3 };

		System.out.println(calcRainWaterCollected(levels));
	}

	private static int calcRainWaterCollected(int[] height) {
		int res = 0;

		int leftMax = 0, rightMax = 0, start = 0, end = height.length - 1;

		while (start < end) {
			if (height[start] < height[end]) {
				if (height[start] > leftMax) {
					leftMax = height[start];
				} else {
					res += leftMax - height[start];
				}
				start++;
			} else {
				if (height[end] > rightMax) {
					rightMax = height[end];
				} else {
					res += rightMax - height[end];
				}
				end--;
			}
		}

		return res;
	}

}
