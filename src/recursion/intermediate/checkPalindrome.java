package recursion.intermediate;

public class checkPalindrome {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1 };
		System.out.println(checkPal(arr, 0, arr.length - 1));
	}

	private static boolean checkPal(int[] arr, int start, int end) {
		if (start >= end)
			return true;

		if (arr[start] == arr[end])
			return checkPal(arr, start + 1, end - 1);

		return false;
	}

}
