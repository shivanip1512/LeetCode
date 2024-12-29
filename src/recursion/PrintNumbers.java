package recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		print(-5);
	}

	private static void print(int n) {
		// base case
		if (n == 0)
			return;
		
		// descending order
		System.out.print(n + " ");
		
		if (n >= 1)
			print(n - 1);
		else
			print(n + 1);

		// ascending order
		System.out.print(n + " ");
	}

}
