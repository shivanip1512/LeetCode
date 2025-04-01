package algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 9, 0, 3, 1, 7, 2 };
		int key = 9;
		int keyIndex = search(arr, key);
		if(keyIndex>=0) {
			System.out.println("Element "+key+" found at Index : "+keyIndex);
		}else {
			System.out.println("Element "+key+" not found!");
		}
	}

	private static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

}
