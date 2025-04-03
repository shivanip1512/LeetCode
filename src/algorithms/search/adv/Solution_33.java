package algorithms.search.adv;

public class Solution_33 {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3 };
		int key = 5;
		int index = search(arr, key);
		System.out.println("arr[" + index + "] = " + key);
	}

	public static int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] >= nums[start]) {
				if (target >= nums[start] && target <= nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
//			if (nums[mid] < nums[end]) 
			else {
				if (target >= nums[mid] && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

}
