package recursion.advance;

import java.util.Scanner;

public class RemoveCharacter {
	private static char toRemove = 'a';

	public static void main(String[] args) {
		String inputString = UdemyUtil.getInputStr();
		StringBuilder sb = new StringBuilder(inputString);
		System.out.println(removeChar(sb, 0));
	}

	private static StringBuilder removeChar(StringBuilder sb, int i) {
		if (i >= sb.length())
			return sb;

		if (sb.charAt(i) == toRemove)
			sb.deleteCharAt(i);
		return removeChar(sb, i + 1);
	}

}
