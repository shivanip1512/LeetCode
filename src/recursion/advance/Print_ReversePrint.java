package recursion.advance;

public class Print_ReversePrint {

	public static void main(String[] args) {
		String s = "shivani";
		printArray(s, 0);
	}

	private static void printArray(String s, int i) {
		if (s == null || i == s.length()) {
			System.out.println();
			return;
		}

		System.out.print(s.charAt(i));
		printArray(s, i + 1);
		System.out.print(s.charAt(i));
	}

}
