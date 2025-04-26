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
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i <= B; i++) {
			nums.add(i);
		}
		int s = 0, e = B - 1, i = 0;
		while (s <= e && i < A.length()) {
			if (A.charAt(i) == 'D') {
				list.add(nums.get(e));
				e--;
			} else {
				list.add(nums.get(s));
				s++;
			}
			i++;
		}
		list.add(nums.get(s));
		return list;
	}
}
