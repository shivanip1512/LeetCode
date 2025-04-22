package leetcode.trees;

public class Solution_151 {

	public static void main(String[] args) {
		String str = "  hello world  ";
		String reverseString = reverseString(str);
		System.out.println(reverseString);
	}

	private static String reverseString(String str) {
		str = str.trim().replaceAll("\\s+", " ");

		StringBuilder sb = new StringBuilder(str);
		int begin = 0, end = 0;
		while (end < str.length()) {
			if (str.charAt(end) == ' ') {
				reverse(sb, begin, end - 1);	// each word
				begin = end + 1;
			}
			end++;
		}
		reverse(sb, begin, end - 1);		// last word
		reverse(sb, 0, sb.length() - 1);	// whole string

		return sb.toString();
	}

	private static void reverse(StringBuilder sb, int begin, int end) {
		while (begin <= end) {
			swap(sb, begin, end);
			begin++;
			end--;
		}
	}

	private static void swap(StringBuilder sb, int begin, int end) {
		char s = sb.charAt(begin);
		char e = sb.charAt(end);
		sb.setCharAt(begin, e);
		sb.setCharAt(end, s);
	}

}
