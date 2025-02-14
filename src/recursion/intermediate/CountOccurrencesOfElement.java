package recursion.intermediate;

public class CountOccurrencesOfElement {

	public static void main(String[] args) {
		int x = 5;
		int arr[] = { 5, 2, 5, 6, 7, 9, 5 };
		System.out.println(countElementOccurrence(arr, arr.length, 0, 0, x));
		System.out.println(countElementOccurrence2(arr, arr.length, 0, x));
	}

	private static int countElementOccurrence2(int[] arr, int n, int i, int x) {
		if (i == n)
			return 0;
		if (arr[i] == x)
			return 1 + countElementOccurrence2(arr, n, i + 1, x);
		else
			return countElementOccurrence2(arr, n, i + 1, x);
	}

	private static int countElementOccurrence(int[] arr, int n, int i, int ans, int x) {
		if (i == n)
			return ans;
		if (arr[i] == x)
			ans++;
		return countElementOccurrence(arr, n, i + 1, ans, x);
	}

}
