package sorting;

import util.UdemyUtil;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = UdemyUtil.getIntArray();
		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] arr, int s, int e) {
		if (s >= e)
			return;

//		int p = partition(arr, s, e);
		int p = partition2(arr, s, e);
		quickSort(arr, s, p - 1);
		quickSort(arr, p + 1, e);
	}

	private static int partition2(int[] arr, int s, int e) {
		int pivotElement = arr[e];
		int i = s;
		for (int j = s; j < e; j++) {
			if (arr[j] < pivotElement) {
				UdemyUtil.swap(arr, i, j);
				i++;
			}
		}
		UdemyUtil.swap(arr, i, e);
		return i;
	}

	private static int partition(int[] arr, int s, int e) {
		int pivotElement = arr[e];
		int countSmaller = 0;
		for (int i = s; i <= e; i++) {
			if (arr[i] < pivotElement)
				countSmaller++;
		}
		int pivotIndex = s + countSmaller;
		UdemyUtil.swap(arr, pivotIndex, e);

		int i = s, j = e;
		while (i < j) {
			if (arr[i] < pivotElement) {
				i++;
			}
			if (arr[j] > pivotElement) {
				j--;
			}
			if (arr[i] > pivotElement && arr[j] < pivotElement) {
				UdemyUtil.swap(arr, i, j);
				i++;
				j--;
			}

		}
		return pivotIndex;
	}

}
