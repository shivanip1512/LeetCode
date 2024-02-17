package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_144 {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> preorderTraversal(TreeNode root) {
		traversal(root);
		return list;
	}

	private void traversal(TreeNode root) {
		if (root == null)
			return;

		list.add(root.val);
		traversal(root.left);
		traversal(root.right);
	}
}
