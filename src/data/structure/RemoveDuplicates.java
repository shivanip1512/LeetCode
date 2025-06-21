package data.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 5, 4, 2 };

		List<Integer> ans = removeDuplicates(arr);
		System.out.println(ans);
	}

	private static List<Integer> removeDuplicates(int[] arr) {
		Map<Integer, Boolean> map = new HashMap<>();
		List<Integer> ans = new ArrayList<Integer>();
		for (int ele : arr) {
			if(!map.containsKey(ele)) {
				map.put(ele, true);
				ans.add(ele);
			}
		}
		return ans;
	}

}
