package recursion.advance;

public class StringToInteger {

	public static void main(String[] args) {
		String s= "1234";
		Integer i = convert(s,s.length()-1);
		System.out.println(i);
	}

	private static Integer convert(String s, int i) {
		if(i<0)
			return 0;
		Integer lastDigit = s.charAt(i) - '0';
		return convert(s, i-1)*10 + lastDigit;
	}

}
