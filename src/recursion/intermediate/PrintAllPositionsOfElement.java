package recursion.intermediate;

public class PrintAllPositionsOfElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 5, 6, 1, 2, 3, 1 };
		printIndexOfElement(arr, arr.length, 0, 1);
	}

	private static void printIndexOfElement(int[] arr, int n, int i, int x) {
		if (i == n)
			return;
		if (arr[i] == x)
			System.out.println(i);
		printIndexOfElement(arr, n, i + 1, x);
	}

}
