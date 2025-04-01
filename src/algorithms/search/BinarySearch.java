package algorithms.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] sortedArr = { 0, 1, 3, 4, 5, 6, 8, 9 };
		int key = 0;
		int keyIndex = binarySearch(sortedArr, 0, sortedArr.length - 1, key);
		if (keyIndex >= 0) {
			System.out.println("Element " + key + " found at Index : " + keyIndex);
		} else {
			System.out.println("Element " + key + " not found!");
		}
	}

	private static int binarySearch(int[] sortedArr, int start, int end, int key) {
		if (start > end)
			return -1;

//		Might cause integer overflow
//		int mid = (start + end) / 2;

		int mid = start + (end - start) / 2;
		int midElement = sortedArr[mid];

		if (midElement == key)
			return mid;
		else if (midElement > key)
			return binarySearch(sortedArr, start, mid - 1, key);
		else
			return binarySearch(sortedArr, mid + 1, end, key);
	}
}
