package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode.TreeNode;

public class Solution_94_2 {
	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> order = new ArrayList<Integer>();
		inorder(root, order);
		return order;
	}

	private void inorder(TreeNode root, List<Integer> order) {
		if (root == null)
			return;

		inorder(root.left, order);
		order.add(root.val);
		inorder(root.right, order);
	}
}
