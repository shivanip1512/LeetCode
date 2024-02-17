package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_94 {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {
		traversal(root);
		return list;
	}

	private void traversal(TreeNode root) {
		if (root != null) {
			traversal(root.left);
			list.add(root.val);
			traversal(root.right);
		}
	}
}
