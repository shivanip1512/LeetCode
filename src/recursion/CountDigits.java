package recursion;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(countDigits(90));
	}

	private static int countDigits(int n) {

		if (n <= 0)
			return n;

		return 1 + countDigits(n/10);
	}

}
