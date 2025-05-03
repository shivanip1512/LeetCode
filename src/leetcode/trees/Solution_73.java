package leetcode.trees;

import util.UdemyUtil;

public class Solution_73 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		setMatrixZeroes(matrix);
		UdemyUtil.print2DArray(matrix);
	}

	private static void setMatrixZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean hasZeroInFirstRow = false, hasZeroInFirstCol = false;

		// Check first column for zeros
		for (int i = 0; i < rows; i++) {
		    if (matrix[i][0] == 0) {
		        hasZeroInFirstCol = true;
		        break;
		    }
		}

		// Check first row for zeros
		for (int j = 0; j < cols; j++) {
		    if (matrix[0][j] == 0) {
		        hasZeroInFirstRow = true;
		        break;
		    }
		}

		// Use first row and column to mark zeros
		for (int i = 1; i < rows; i++) {
		    for (int j = 1; j < cols; j++) {
		        if (matrix[i][j] == 0) {
		            matrix[i][0] = 0;
		            matrix[0][j] = 0;
		        }
		    }
		}

		// Zero out cells based on markers
		for (int i = 1; i < rows; i++) {
		    for (int j = 1; j < cols; j++) {
		        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
		            matrix[i][j] = 0;
		        }
		    }
		}

		// Zero out first row if needed
		if (hasZeroInFirstRow) {
		    for (int j = 0; j < cols; j++) {
		        matrix[0][j] = 0;
		    }
		}

		// Zero out first column if needed
		if (hasZeroInFirstCol) {
		    for (int i = 0; i < rows; i++) {
		        matrix[i][0] = 0;
		    }
		}

	}

}
