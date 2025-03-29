package util;

import java.util.Scanner;

public class UdemyUtil {
	public static String getInputStr() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		return scanner.nextLine();
	}
	
	public static Integer getInputInt(String s) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(s);
		return scanner.nextInt();
	}
	
	public static Integer getInputInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static String swap(String s, int i, int j) {
		StringBuilder sb = new StringBuilder(s);

		// Swap the characters at positions i and j
		char temp = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, temp);

		return sb.toString();
	}
	
	public static void swap(int[] arr, int i, Integer j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int[] getIntArray() {
		Integer arrayLength = UdemyUtil.getInputInt("Enter array length: ");
		int[] arr = new int[arrayLength];

		System.out.println("Enter elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = UdemyUtil.getInputInt();
		}
		return arr;
	}
}
