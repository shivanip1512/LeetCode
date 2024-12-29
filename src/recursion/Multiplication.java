package recursion;

public class Multiplication {
	public static void main(String[] args) {
		System.out.println(multiplyUsingAddition(5, 4));
	}

	private static int multiplyUsingAddition(int m, int n) {
		if (n == 1)
			return m;

		return m + multiplyUsingAddition(m, n - 1);
	}
}
