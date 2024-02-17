package leetcode.trees;

import java.util.Stack;

class BSTIterator {
	Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack<TreeNode>();
		updateStack(root);
	}

	private void updateStack(TreeNode root) {
		while (root != null) {
			stack.add(root);
			root = root.left;
		}
	}

	public int next() {
		TreeNode node = stack.pop();
		updateStack(node.right);
		return node.val;
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}
}
