package recursion.intermediate;

import java.util.Arrays;

public class isElementPresent {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 1, 9, 6 };
		System.out.println(isPresent(arr, arr.length, 1, 0));
	}

	private static boolean isPresent(int[] arr, int n, int x) {
		if (n == 0)
			return false;

		if (arr[0] == x)
			return true;

		return isPresent(Arrays.copyOfRange(arr, 1, n), n - 1, x);
	}

	private static boolean isPresent(int[] arr, int n, int x, int i) {
		if (i == n)
			return false;

		if (arr[i] == x)
			return true;

		return isPresent(arr, n, x, i + 1);
	}
}
