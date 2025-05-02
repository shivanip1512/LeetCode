package leetcode.trees;

public class Solution_48 {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		print2DArray(matrix);
	}

	private static void print2DArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
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
