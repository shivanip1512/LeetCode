package recursion.advance;

import java.util.ArrayList;

import util.UdemyUtil;

public class StoreSubsequence {

	public static void main(String[] args) {
		String inputStr = UdemyUtil.getInputStr();
		ArrayList<String> subsequence = new ArrayList<String>();
		subsequence(inputStr, "", subsequence);
		System.out.println(subsequence);
	}

	private static void subsequence(String in, String out, ArrayList<String> subsequence) {
		if (in == null || in.isEmpty()) {
			subsequence.add(out);
			return;
		}
		String substring = in.substring(1);
		subsequence(substring, out, subsequence);
		subsequence(substring, out + in.charAt(0), subsequence);
	}

}
