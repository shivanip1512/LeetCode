package sorting;

import util.UdemyUtil;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = UdemyUtil.getIntArray();
		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int[] arr, int start, int end) {
		// length 0 or 1
		if (start >= end)
			return;

		int mid = (end + start) / 2;
		int[] x = new int[mid - start + 1];
		int[] y = new int[end - mid];

		for (int i = start; i <= mid; i++) {
			x[i - start] = arr[i];
		}
		for (int i = mid + 1; i <= end; i++) {
			y[i - (mid + 1)] = arr[i];
		}

		mergeSort(x, 0, x.length-1);
		mergeSort(y, 0, y.length-1);

		mergeArrays(arr, x, y, start, end);

	}

	private static void mergeArrays(int[] arr, int[] x, int[] y, int start, int end) {
		int i = 0, j = 0, k = start;
		while (i < x.length && j < y.length) {
			if (x[i] < y[j]) {
				arr[k++] = x[i++];
			} else {
				arr[k++] = y[j++];
			}
		}
		while (i < x.length) {
			arr[k++] = x[i++];
		}
		while (j < y.length) {
			arr[k++] = y[j++];
		}
	}
}
