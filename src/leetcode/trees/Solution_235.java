package leetcode.trees;

public class Solution_235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		int rootVal = root.val;
		if (p.val < rootVal && q.val < rootVal) {
			System.out.println("Going left: " + rootVal);
			return lowestCommonAncestor(root.left, p, q);
		} else if (p.val > rootVal && q.val > rootVal) {
			System.out.println("Going right: " + rootVal);
			return lowestCommonAncestor(root.right, p, q);
		} else {
			System.out.println("Found LCA: " + rootVal);
			return root;
		}
	}

	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
		while (root != null) {
			int rootVal = root.val;
			if (p.val < rootVal && q.val < rootVal) {
				root = root.left;
			} else if (p.val > rootVal && q.val > rootVal) {
				root = root.right;
			} else
				return root;
		}
		return null;
	}

}
