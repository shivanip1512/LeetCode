package recursion.advance;

import util.UdemyUtil;

public class PermutationsOfString {

	public static void main(String[] args) {
		String s = UdemyUtil.getInputStr();
		printAllPermutation(s, 0);
	}

	private static void printAllPermutation(String s, int i) {
		if (s == null || s.isEmpty() || i == s.length()) {
			System.out.println(s);
			return;
		}
		for (int j = i; j < s.length(); j++) {
			s = UdemyUtil.swap(s, i, j);
			printAllPermutation(s, i + 1);
		}
	}
}
