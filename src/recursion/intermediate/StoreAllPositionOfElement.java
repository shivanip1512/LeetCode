package recursion.intermediate;

import java.util.ArrayList;

public class StoreAllPositionOfElement {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 8, 5, 1, 2, 6, 5, 7 };
		int x = 7;
		ArrayList<Integer> list = new ArrayList<Integer>();
		storePos(arr, list, 0, x);
		System.out.println(list);

		Integer[] output = new Integer[10];
		int occurance = storePosUsingArray(arr, output, 0, 0, x);
		for (int i = 0; i < occurance; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int storePosUsingArray(int[] arr, Integer[] output, int i, int j, int x) {
		if (i == arr.length)
			return 0;

		if (arr[i] == x) {
			output[j++] = i;
			return 1 + storePosUsingArray(arr, output, i + 1, j, x);
		}

		return storePosUsingArray(arr, output, i + 1, j, x);
	}

	private static void storePos(int[] arr, ArrayList<Integer> list, int i, int x) {
		if (i == arr.length)
			return;
		if (arr[i] == x)
			list.add(i);
		storePos(arr, list, i + 1, x);
	}

}
