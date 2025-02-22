package recursion.advance;

public class ReplaceCharacter {
	private static char toReplace = 'i';
	private static char withReplace = 'y';

	public static void main(String[] args) {
		String inputString = UdemyUtil.getInputStr();

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
