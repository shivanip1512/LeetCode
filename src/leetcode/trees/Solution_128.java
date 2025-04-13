package leetcode.trees;

import java.util.Arrays;

public class Solution_128 {

	public static void main(String[] args) {
		int[] nums = { 100, 101, 102, 4, 200, 1, 3 };
		int result = longestConsecutive(nums);
		System.out.println(result);
	}

	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0)
			return 0;
		Arrays.sort(nums);
		int max = 1;
		int count = 1;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 1; i++) {
			// Skip duplicates
			if (nums[i] == nums[i + 1]) {
				continue;
			} else if (nums[i] == nums[i + 1] - 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 1;
			}
		}
		return max > count ? max : count;
	}
}
