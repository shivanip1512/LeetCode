package leetcode.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// interviewbit link  : https://www.interviewbit.com/problems/find-permutation/
public class Solution_184 {
	public static void main(String[] args) {
		String s = "DIDD";
		int n = 5;
		List<Integer> list = findPerm(s, n);
		System.out.println(list);
	}

	public static List<Integer> findPerm(final String A, int B) {
		List<Integer> list = new ArrayList<Integer>();
		int s = 1, e = B;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == 'D') {
				list.add(e);
				e--;
			} else {
				list.add(s);
				s++;
			}
		}
		list.add(s);
		return list;
	}
}
