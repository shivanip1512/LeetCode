package com.java.dp;

public class minFlipsBinary {

	public static void main(String[] args) {
		int a = 8, b = 3, c = 5;

		System.out.println(minFlips(a, b, c));
	}

	private static int minFlips(int a, int b, int c) {
		int res = 0;

		int b_a = 0, b_b = 0, b_c = 0;
		for (int i = 1; i <= 32; i++) {
			b_a = 0;
			b_b = 0;
			b_c = 0;
			if (((a >> (i - 1)) & 1) >= 1)
				b_a = 1;
			if (((b >> (i - 1)) & 1) >= 1)
				b_b = 1;
			if (((c >> (i - 1)) & 1) >= 1)
				b_c = 1;

			if (b_c == 0 && (b_a == 1 || b_b == 1))
				res += b_a+b_b;
			else if (b_c == 1 && b_a == 0 && b_b == 0)
				res += 1;

		}

		return res;
	}
}
