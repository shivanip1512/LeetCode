package algorithms.search.adv;

public class Solution_34 {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int key = 8;
		int firstIndex = getFirstIndex(arr, key);
		int lastIndex = getLastIndex(arr, key);
		System.out.println(firstIndex + " " + lastIndex);
	}

	private static int getFirstIndex(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == key) {
				ans = mid;
				e = mid - 1;
			} else if (arr[mid] < key) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}

	private static int getLastIndex(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == key) {
				ans = mid;
				s = mid + 1;
			} else if (arr[mid] < key) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}

}
