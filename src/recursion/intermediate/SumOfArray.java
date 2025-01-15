package recursion.intermediate;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4,10};
		System.out.println(sumArray(arr, arr.length));
	}

	private static int sumArray(Integer[] arr, int length) {
		if(length==0)
			return 0;
		
		return arr[0]+sumArray(Arrays.copyOfRange(arr, 1, length), length-1);
	}

}
