package algorithms.search.adv;

public class Solution_69 {

	public static void main(String[] args) {
		int x = 2147395599;
		int mySqrt = mySqrt(x);
		System.out.println(mySqrt);
	}

	public static int mySqrt(int x) {
		if (x == 0)
			return 0;

		int start = 1, end = x, ans = 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println(start + " : " + end + " : " + mid);
			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}
}
