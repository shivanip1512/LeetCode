package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_144_2 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> order = new ArrayList<Integer>();
		preorder(root, order);
		return order;
	}

	private void preorder(TreeNode root, List<Integer> order) {
		if (root == null)
			return;
		order.add(root.val);
		preorder(root.left, order);
		preorder(root.right, order);
	}
}
