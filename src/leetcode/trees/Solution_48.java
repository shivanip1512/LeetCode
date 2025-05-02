package leetcode.trees;

import util.UdemyUtil;

public class Solution_48 {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		UdemyUtil.print2DArray(matrix);
	}

	public static void rotate(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// 1. Transpose (swap rows and cols)
		for (int row = 0; row < rows; row++) {
			for (int col = row + 1; col < cols; col++) { // start from row + 1
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}

		// 2. Reverse rows
		for (int row = 0; row < rows; row++) {
			int s = 0, e = cols - 1;
			while (s <= e) {
				int temp = matrix[row][s];
				matrix[row][s] = matrix[row][e];
				matrix[row][e] = temp;
				s++;
				e--;
			}
		}
	}


}
