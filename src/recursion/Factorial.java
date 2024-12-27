package recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	private static int fact(int n) {
		// base case
		if (n <= 0)
			return 1;

		return n * fact(n - 1);
	}

}
