package leetcode.trees;

import java.util.Stack;

class Solution_1209 {

	public static void main(String[] args) {
		String s = "deeedbbcccbdaa";
		System.out.println(removeDuplicates(s, 3));

	}

	private static String removeDuplicates(String s, int k) {

		Stack<int[]> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (stack.isEmpty() || stack.peek()[0] != c) {
				stack.push(new int[] { c, 1 });
			} else if (stack.peek()[1] == k - 1) {
				stack.pop();
			} else {
				stack.peek()[1]++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int[] pair : stack) {
			for (int i = 0; i < pair[1]; i++) {
				sb.append((char) pair[0]);
			}
		}

		return sb.toString();
	}

}
