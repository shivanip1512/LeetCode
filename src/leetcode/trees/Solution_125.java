package leetcode.trees;

public class Solution_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
