package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class Solution_145_2 {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> order = new ArrayList<Integer>();
		postorder(root, order);
		return order;
	}

	private void postorder(TreeNode root, List<Integer> order) {
		if (root == null)
			return;
		postorder(root.left, order);
		postorder(root.right, order);
		order.add(root.val);
	}
}
