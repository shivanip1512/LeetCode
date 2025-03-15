package sorting;

import util.UdemyUtil;

public class SelectionSort {

	public static void main(String[] args) {

		Integer arrayLength = UdemyUtil.getInputInt("Enter array length: ");
		int[] arr = new int[arrayLength];

		System.out.println("Enter elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = UdemyUtil.getInputInt();
		}

//		usingForLogic(arr);
		usingRecursion(arr, 0);

		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}

	private static void usingRecursion(int[] arr, int i) {
		if (i + 1 == arr.length)
			return;
		Integer min = getSmallestElement(arr, i + 1);
		if (arr[min] < arr[i]) {
			UdemyUtil.swap(arr, i, min);
		}

		usingRecursion(arr, i + 1);
	}

	private static void usingForLogic(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length) {
				Integer min = getSmallestElement(arr, i + 1);
				if (arr[min] < arr[i]) {
					UdemyUtil.swap(arr, i, min);
				}
			}
		}
	}

	private static Integer getSmallestElement(int[] arr, int i) {
		int min = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[min])
				min = j;
		}
		return min;
	}

}
