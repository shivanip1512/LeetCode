package leetcode.trees;

import java.util.Stack;

public class Solution_20 {
	public static void main(String[] args) {
		String s = "([]{}()))";
		boolean valid = isValid(s);
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		Stack<Character> sc = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{')
				sc.push(c);
			else {
				if (!sc.isEmpty()) {
					if (c == '}') {
						Character top = sc.peek();
						if (top == '{')
							sc.pop();
						else
							return false;
					} else if (c == ')') {
						Character top = sc.peek();
						if (top == '(')
							sc.pop();
						else
							return false;
					} else if (c == ']') {
						Character top = sc.peek();
						if (top == '[')
							sc.pop();
						else
							return false;
					}
				} else
					return false;
			}
		}
		return sc.isEmpty();
	}
}
