package leetcode.trees;

public class Solution_45 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 0, 1, 4 };
		int minJumps = minJumps(arr);
		System.out.println(minJumps);
	}

	private static int minJumps(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return 0;
		if (nums[0] == 0)
			return -1;

		int longestLadder = nums[0], stair = nums[0];
		int jump = 1;
		for (int currStair = 1; currStair < length; currStair++) {
			if (currStair == length - 1)
				return jump;

			if (currStair + nums[currStair] > longestLadder) {
				longestLadder = currStair + nums[currStair];
			}

			stair--;
			if (stair == 0) {
				jump++;
				stair = longestLadder - currStair;
				if (stair < 0)
					return -1;
			}
		}
		return -1;
	}

}
