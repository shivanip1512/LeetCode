package util;

import java.util.Scanner;

public class UdemyUtil {
	public static String getInputStr() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		return scanner.nextLine();
	}
	
	public static String swap(String s, int i, int j) {
		StringBuilder sb = new StringBuilder(s);

		// Swap the characters at positions i and j
		char temp = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, temp);

		return sb.toString();
	}
}
