package leetcode.trees;

public class Solution_6 {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int rows = 3;
		String string = convert(s, rows);
		System.out.println(string);
	}

	public static String convert(String s, int numRows) {
		if (numRows <= 1)
			return s;
		StringBuilder[] strArr = java.util.stream.IntStream.range(0, numRows).mapToObj(i -> new StringBuilder())
				.toArray(StringBuilder[]::new);
		for (int i = 0, row = 0, dir = 1; i < s.length(); i++) {
			strArr[row].append(s.charAt(i));

			// row++ or row--
			if (row == numRows - 1)
				dir = -1;
			else if (row == 0)
				dir = 1;

			row += dir;
		}
		String ans = "";
		for (int i = 0; i < numRows; i++) {
			ans += strArr[i];
		}
		return ans;
	}

}
