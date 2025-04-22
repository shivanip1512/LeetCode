package leetcode.trees;

public class Solution_55 {

	public static void main(String[] args) {
		int[] arr = {2,0,0};
		boolean jumpGame = jumpGame(arr);
		System.out.println(jumpGame);
	}

	private static boolean jumpGame(int[] nums) {
		int goodIndex = nums.length - 1;
		for (int currIndex = nums.length - 2; currIndex > 0; currIndex--) {
			if (currIndex + nums[currIndex] >= goodIndex) {
				goodIndex = currIndex;
			}
		}
		if (goodIndex != 0)
			return false;
		return true;
	}

}
