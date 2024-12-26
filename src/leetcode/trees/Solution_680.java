package leetcode.trees;

public class Solution_680 {
	public static void main(String[] args) {

		String string = "abbdca";
		System.out.println(validPalindrome(string));
	}

	public static boolean validPalindrome(String s) {
		int start =0, end = s.length()-1;
		
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				/*
				 *  2 cases :
				 *  1. Delete start : check palindrome [start+1 to end]
				 *  2. Delete end : check palindrome [start to end-1]
				 */
				return checkPalindrome(s, start+1, end) || checkPalindrome(s, start, end-1);
			}
			start++; end--;
		}
		
		return true;
	}
	
	private static boolean checkPalindrome(String s, int start, int end) {
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++; end--;
		}
		return true;
	}
}
