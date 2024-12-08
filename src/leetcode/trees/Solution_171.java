package leetcode.trees;

public class Solution_171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	public int titleToNumber(String columnTitle) {
		int result = 0, power = 1;
		for (int i = columnTitle.length() - 1; i >= 0; i--) {
			char upperCase = Character.toUpperCase(columnTitle.charAt(i));
			int val = upperCase - 'A' + 1;
			result += power * val;
			power *= 26;
		}
		return result;
	}
}
