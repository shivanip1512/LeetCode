package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

import util.UdemyUtil;

public class Solution_54 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		UdemyUtil.print2DArray(matrix);
		List<Integer> spiralOrder = spiralOrder(matrix);
		System.out.println("Spriral Order : " + spiralOrder);
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();
		int rows = matrix.length, cols = matrix[0].length;

		int sr = 0, er = rows - 1, sc = 0, ec = cols - 1, count = 0;
		while (sr <= er && sc <= ec) {
			// Step 1: print sr
			for (int i = sc; i <= ec; i++) {
				ans.add(matrix[sr][i]);
				count++;
			}
			sr++;

			if (count == rows * cols) {
				return ans;
			}

			// Step 2: print ec
			for (int i = sr; i <= er; i++) {
				ans.add(matrix[i][ec]);
				count++;
			}
			ec--;

			if (count == rows * cols) {
				return ans;
			}

			// Step 3: print er
			for (int i = ec; i >= sc; i--) {
				ans.add(matrix[er][i]);
				count++;
			}
			er--;

			if (count == rows * cols) {
				return ans;
			}

			// Step 4: print sc
			for (int i = er; i >= sr; i--) {
				ans.add(matrix[i][sc]);
				count++;
			}
			sc++;

			if (count == rows * cols) {
				return ans;
			}
		}
		return ans;
	}
}
