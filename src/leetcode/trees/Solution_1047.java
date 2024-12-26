package leetcode.trees;

import java.util.Iterator;
import java.util.Stack;

public class Solution_1047 {

	public static void main(String[] args) {
		String s = "abba";
		System.out.println(removeDuplicates(s));
	}

	private static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		int sptr = -1;
		for (char c : s.toCharArray()) {
			if (sptr == -1 || c != sb.charAt(sptr)) {
				sb.append(c);
				sptr++;
			} else {
				sb.deleteCharAt(sptr);
				sptr--;
			}

		}
		return sb.toString();
	}

	public static String removeDuplicates1(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty())
				stack.push(s.charAt(i));
			else if (stack.peek() == s.charAt(i))
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.append(stack.pop());
		return sb.reverse().toString();
	}
}
