package recursion.advance;

import util.UdemyUtil;

public class StringToInteger {

	public static void main(String[] args) {
		String s = UdemyUtil.getInputStr();
		Integer i = convert(s, s.length());
		System.out.println(i);
	}

	private static Integer convert(String s, int i) {
		if (i == 0)
			return 0;
		Integer lastDigit = s.charAt(i-1) - '0';
		return convert(s, i - 1) * 10 + lastDigit;
	}

}
