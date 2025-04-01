package leetcode.trees;

public class Solution_169 {

	public static void main(String[] args) {
		int [] arr = {2,2,1,1,1,2,2,1,1};
		System.out.println(majorityCount(arr));
	}

	private static int majorityCount(int[] arr) {
		int element = arr[0], count=1;
		for (int i = 1; i < arr.length; i++) {
			if(element == arr[i])
				count++;
			else {
				count--;
				if(count==0) {
					element = arr[i];
					count=1;
				}
			}
		}
		return element;
	}

}
