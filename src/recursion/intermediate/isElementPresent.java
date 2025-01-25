package recursion.intermediate;

import java.util.Arrays;

public class isElementPresent {

	public static void main(String[] args) {
		int arr[] = {1,3,5,1,9,6};
		System.out.println(isPresent(arr, arr.length, 10));;
	}

	private static boolean isPresent(int[] arr, int n, int x) {
		if(n==0)
			return false;
		
		if(arr[0]==x)
			return true;
		
		return isPresent(Arrays.copyOfRange(arr, 1, n), n-1, x);
	}

}
