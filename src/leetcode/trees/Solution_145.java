package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_145 {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> postorderTraversal(TreeNode root) {
		traversal(root);
		return list;
	}

	private void traversal(TreeNode root) {
		if (root == null)
			return;
		traversal(root.left);
		traversal(root.right);
		list.add(root.val);
	}
}
