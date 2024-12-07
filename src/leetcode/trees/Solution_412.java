package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> str = new ArrayList<String>();
		for (Integer i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				str.add("FizzBuzz");
			else if (i % 3 == 0)
				str.add("Fizz");
			else if (i % 5 == 0)
				str.add("Buzz");
			else {
				str.add(i.toString());
			}
		}
		return str;
	}
}
