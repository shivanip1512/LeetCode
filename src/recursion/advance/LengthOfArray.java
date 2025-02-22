package recursion.advance;

public class LengthOfArray {

	public static void main(String[] args) {
		String str = "shivani";
		System.out.println(length(str));
	}

	private static int length(String s) {
		if(s==null || s.isEmpty())
			return 0;
		return 1+length(s.substring(1));
	}

}
