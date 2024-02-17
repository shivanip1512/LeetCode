package leetcode.trees;

public class Solution_230 {
	int i = 0, val;

	public int kthSmallest(TreeNode root, int k) {
		traverse(root, k);
		return val;
	}

	private void traverse(TreeNode root, int k) {
		if (root == null)
			return;
		traverse(root.left, k);
		if (++i == k)
			val = root.val;
		traverse(root.right, k);
	}
}
