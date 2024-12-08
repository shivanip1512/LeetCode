package leetcode.trees;

public class Solution_168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String convertToTitle(int columnNumber) {
		StringBuilder stringBuilder = new StringBuilder();
		while (columnNumber-- > 0) {
			char val = (char) ('A' + (columnNumber % 26));
			stringBuilder.append(val);
			columnNumber /= 26;
		}
		return stringBuilder.reverse().toString();
	}
}
