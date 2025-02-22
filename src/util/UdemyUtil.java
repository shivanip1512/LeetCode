package util;

import java.util.Scanner;

public class UdemyUtil {
	public static String getInputStr() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		return scanner.nextLine();
	}
}
