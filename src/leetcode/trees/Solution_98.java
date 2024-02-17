package leetcode.trees;

public class Solution_98 {
	TreeNode prev_node = null;

	public boolean isValidBST(TreeNode root) {
		if (root != null) {
			if (!isValidBST(root.left))
				return false;

			if (prev_node != null && prev_node.val <= root.val)
				return false;

			prev_node = root;

			return isValidBST(root.right);

		}
		return true;
	}
}
