package recursion;

public class CountZeroes {

	public static void main(String[] args) {
		System.out.println(countZeroes(105860));
	}

	private static int countZeroes(int n) {
		if(n==0)
			return 0;
		int smallAns = countZeroes(n/10);
		int lastDigit = n%10;
		
		return lastDigit==0?smallAns+1:smallAns;
	}

}
