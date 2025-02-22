package recursion.advance;

import util.UdemyUtil;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String inputStr = UdemyUtil.getInputStr();
		StringBuilder sb = new StringBuilder(inputStr);
		System.out.println(removeConsDuplicates(sb, 0));
	}

	private static StringBuilder removeConsDuplicates(StringBuilder sb, int i) {
		if(i+1>=sb.length()) {
			return sb;
		}
		if(sb.charAt(i)==sb.charAt(i+1)) {
			sb.deleteCharAt(i--);
		}
		
		return removeConsDuplicates(sb, i+1);
	}

}
