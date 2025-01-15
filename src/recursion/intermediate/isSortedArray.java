package recursion.intermediate;

import java.util.Arrays;

public class isSortedArray {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4};
		System.out.println(isSortedArray(arr, arr.length));
	}

	private static Boolean isSortedArray(Integer[] arr, int n) {
		if (n == 0 || n == 1)
			return true;

		if (arr[0] > arr[1])
			return false;
		else
			return isSortedArray(Arrays.copyOfRange(arr, 1, n), n - 1);
	}
}
