package leetcode.trees;

public class Solution_59 {

	public static int lengthOfLastWord(String s) {
		int len=0;
		int strLen = s.length();
		for (int i = 0; i < strLen; i++) {
			if(s.charAt(i)!=' ') {
				len++;i++;
			}
			else {
				while(i<strLen && s.charAt(i) == ' ' )i++;
				
				if(i==strLen-1)
					return len;
				else
					len=0;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		String s= "Hello world Shivani";
		System.out.println(lengthOfLastWord(s));
	}
}
