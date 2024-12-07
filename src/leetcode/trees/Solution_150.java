package leetcode.trees;

import java.util.Stack;

public class Solution_150 {

	public static void main(String[] args) {
		String[] exp = { "4", "13", "5", "/", "+" };
		System.out.println(evalRPN(exp));
	}

	/**
	 * Rules: 2 operand to apply a operator
	 * 
	 * @param tokens
	 * @return
	 */
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String string : tokens) {
			if (!isOperand(string)) {
				stack.push(Integer.valueOf(string));
			} else {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				if (string.equals("+"))
					stack.push(operand2 + operand1);
				else if (string.equals("-"))
					stack.push(operand2 - operand1);
				else if (string.equals("*"))
					stack.push(operand2 * operand1);
				else if (string.equals("/"))
					stack.push(operand2 / operand1);
			}
		}
		return stack.pop();
	}

	public static boolean isOperand(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	}
}
