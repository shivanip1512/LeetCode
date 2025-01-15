package recursion.intermediate;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4,10};
		System.out.println(sumArray(arr, arr.length));
		System.out.println(sumArray2(arr,arr.length,0));
	}

	private static int sumArray2(Integer[] arr, int length, int i) {
		if(i==length)
			return 0;
		
		return arr[i]+sumArray2(arr, length, i+1);
	}

	private static int sumArray(Integer[] arr, int length) {
		if(length==0)
			return 0;
		
		return arr[0]+sumArray(Arrays.copyOfRange(arr, 1, length), length-1);
	}

}
