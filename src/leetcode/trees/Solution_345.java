package leetcode.trees;

import java.util.Iterator;

public class Solution_345 {

	public String reverseVowels(String s) {
		int start = 0;
		int end = s.length() - 1;
		char[] charArray = s.toCharArray();
		while (start < end) {
			while (start < end && !isVowel(charArray[start]))
				start++;
			while (start < end && !isVowel(charArray[end]))
				end--;
			if (isVowel(charArray[start]) && isVowel(charArray[end])) {
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
		}
		return charArray.toString();
	}

	private boolean isVowel(char c) {
		char ch = Character.toLowerCase(c);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
