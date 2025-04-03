package algorithms.search.adv;

public class Solution_34 {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int key = 8;
		int[] searchRange = searchRange(arr, key);
		System.out.println(searchRange);
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] indices = { -1, -1 };
		int firstIndex = getIndex(nums, target, true);
		if (firstIndex == -1) {
			return indices;
		} else {
			indices[0] = firstIndex;
			indices[1] = getIndex(nums, target, false);
			return indices;
		}
	}

	private static int getIndex(int[] arr, int key, boolean isFirstIndex) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == key) {
				ans = mid;
				if (isFirstIndex) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			} else if (arr[mid] < key) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}

}
