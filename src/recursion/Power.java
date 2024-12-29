package recursion;

public class Power {

	public static void main(String[] args) {
		System.out.println(myPow(2, -2));
	}

	private static double myPow(double x, int n) {
		// base case
		if (n == 0)
			return 1;

		long N = n;

		if (N < 0) {
			x = 1 / x;
			N *= -1;
		}

		if (N % 2 == 0)
			return myPow(x * x, (int) (N / 2));
		else
			return x * myPow(x, (int) (N - 1));
	}

}
