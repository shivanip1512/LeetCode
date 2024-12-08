package leetcode.trees;

public class Solution_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

	public boolean isPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			while (start < end && !Character.isLetterOrDigit(s.charAt(start)))
				start++;
			while (start < end && !Character.isLetterOrDigit(s.charAt(end)))
				end--;
			if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				return false;

			start++;
			end--;
		}
		return true;
	}
}
