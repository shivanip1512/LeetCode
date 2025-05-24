package leetcode.trees;

public class Solution_226 {
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		swap(root);
		root.left = invertTree(root.left);
		root.right = invertTree(root.right);
		return root;
	}

	private void swap(TreeNode root) {
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}
