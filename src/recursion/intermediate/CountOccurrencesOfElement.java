package recursion.intermediate;

public class CountOccurrencesOfElement {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 5, 6, 7, 9, 5 };
		System.out.println(countElementOccurrence(arr, arr.length, 0, 0, 5));
	}

	private static int countElementOccurrence(int[] arr, int n, int i, int ans, int x) {
		if (i == n)
			return ans;
		if (arr[i] == x)
			ans++;
		return countElementOccurrence(arr, n, i + 1, ans, x);
	}

}
