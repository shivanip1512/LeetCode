package leetcode.trees;

public class Solution_98_1 {

	public boolean isValidBST(TreeNode root) {
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode node, long minValue, long maxValue) {
		if (node == null)
			return true;

		if (node.val <= minValue || node.val >= maxValue)
			return false;

		return validate(node.left, minValue, node.val) && validate(node.right, node.val, maxValue);
	}
}
