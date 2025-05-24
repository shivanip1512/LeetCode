package leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_111 {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return minDepth(root.right) + 1;
		if (root.right == null)
			return minDepth(root.left) + 1;

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	
	// Using level order traversal
	public int minDepth1(TreeNode root) {
		if (root == null)
			return 0;

		Queue<Element> queue = new LinkedList<Element>();
		queue.add(new Element(root, 1));

		while (!queue.isEmpty()) {
			Element ele = queue.poll();
			if (ele.node.left == null && ele.node.right == null)
				return ele.level;
			if (ele.node.left != null)
				queue.add(new Element(ele.node.left, ele.level + 1));
			if (ele.node.right != null)
				queue.add(new Element(ele.node.right, ele.level + 1));
		}

		return 0;
	}
	
	class Element {
		TreeNode node;
		int level;

		public Element(TreeNode node, int level) {
			this.node = node;
			this.level = level;
		}
	}
}
