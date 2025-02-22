package recursion.advance;

import java.util.Scanner;

public class ReplaceCharacter {
	private static char toReplace = 'i';
	private static char withReplace = 'y';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		StringBuilder sb = new StringBuilder(inputString);
		System.out.println("Replaced '" + toReplace + "' with '" + withReplace + "': " + replaceChar(sb, 0));
	}

	private static StringBuilder replaceChar(StringBuilder sb, int i) {
		if (i == sb.length())
			return sb;

		// replace character
		if (sb.charAt(i) == toReplace)
			sb.setCharAt(i, withReplace);

		return replaceChar(sb, i + 1);
	}
}
