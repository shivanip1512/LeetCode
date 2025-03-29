package sorting;

import util.UdemyUtil;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = UdemyUtil.getIntArray();

		for (int count = 1; count <= arr.length - 1; count++) {
			for (int j = 0; j <= arr.length - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					UdemyUtil.swap(arr, j, j + 1);
				}
			}
		}

		System.out.println("After sort :");
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

}
