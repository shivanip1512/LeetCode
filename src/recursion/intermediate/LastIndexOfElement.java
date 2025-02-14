package recursion.intermediate;

public class LastIndexOfElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 6 };
		System.out.println(lastIndexOfElement(arr, arr.length - 1, 2));
		System.out.println(lastIndexOfElement2(arr, arr.length, 0, 2));
	}

	private static int lastIndexOfElement2(int[] arr, int n, int i, int x) {
		if (i == n)
			return -1;
		int indexInRemaningArr = lastIndexOfElement2(arr, n, i + 1, x);
		if (indexInRemaningArr == -1) {
			if (arr[i] == x)
				return i;
			else
				return -1;
		} else
			return indexInRemaningArr;
	}

	private static int lastIndexOfElement(int[] arr, int n, int x) {
		if (n == 0)
			return -1;
		else if (arr[n] == x)
			return n;

		return lastIndexOfElement(arr, n - 1, x);
	}
}
