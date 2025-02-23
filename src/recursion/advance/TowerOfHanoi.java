package recursion.advance;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int disks = 5;
		System.out.println(toh(disks));
	}

	private static int toh(int n) {
		if (n == 0)
			return 0;

		/*
		 * Move
		 * (n-1) disks from A->B,
		 * put disk from A->C,
		 * put (n-1) disks from B->C
		 */
		return toh(n - 1) + 1 + toh(n - 1);
	}

}
