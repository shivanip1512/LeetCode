package leetcode.trees;

public class Solution_leetcode {
	public static void main(String[] args) {
		System.out.println(angleOfSector(35D,30D));
	}

	public static int angleOfSector(double height, double baseRadius) {
		int angle = (int) ((1 - baseRadius / (Math.sqrt(baseRadius * baseRadius + height * height))) * 360);
		return angle;
	}
}
