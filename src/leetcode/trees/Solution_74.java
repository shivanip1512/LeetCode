package leetcode.trees;

import util.UdemyUtil;

public class Solution_74 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 13;
		UdemyUtil.print2DArray(matrix);
		boolean isPresent = searchMatrix(matrix, target);
		System.out.println(isPresent);
	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length, row = 0, col = matrix[0].length - 1;

		if (rows == 0 || (col + 1) == 0 || target < matrix[0][0] || target > matrix[rows - 1][col])
			return false;

		while (row < rows && col >= 0) {
			if (matrix[row][col] == target)
				return true;
			else if (matrix[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}

		return false;
	}

}
