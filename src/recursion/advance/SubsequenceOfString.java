package recursion.advance;

import util.UdemyUtil;

public class SubsequenceOfString {

	public static void main(String[] args) {
		String inputStr = UdemyUtil.getInputStr();
		subsequence(inputStr, "");
	}

	private static void subsequence(String in, String out) {
		if (in == null || in.isEmpty()) {
			System.out.print("\""+out+"\", ");
			return;
		}
		// exclude
		subsequence(in.substring(1), out);
		// include
		subsequence(in.substring(1), out + in.charAt(0));
	}

}
