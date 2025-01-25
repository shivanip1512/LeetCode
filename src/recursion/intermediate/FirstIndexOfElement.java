package recursion.intermediate;

public class FirstIndexOfElement {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 3, 4, 78, 5, 1 };

		System.out.println(getFirstIndex(arr, arr.length, 4, 0));
	}

	private static int getFirstIndex(int[] a, int n, int x, int i) {
		if (i == n)
			return -1;

		if (a[i] == x)
			return i;

		return getFirstIndex(a, n, x, i + 1);
	}
}
