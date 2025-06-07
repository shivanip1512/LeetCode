package leetcode.trees;

import java.util.HashMap;

public class Solution_1 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			int complement = target - curr;
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(curr, i);
		}
		return null;
	}
}
