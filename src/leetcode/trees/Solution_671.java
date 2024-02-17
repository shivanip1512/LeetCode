package leetcode.trees;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution_671 {
	Set<Integer> set = new TreeSet<Integer>();
	public int findSecondMinimumValue(TreeNode root) {
		traverse(root);
		int i=0;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(++i==2)
				return integer;
		}
		return -1;
	}

	private void traverse(TreeNode root) {
		if (root == null)
			return;
		traverse(root.left);
		set.add(root.val);
		traverse(root.right);

	}
}
