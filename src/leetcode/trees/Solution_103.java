package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null)
			return ans;
		List<Integer> temp = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == null) {
				ans.add(new ArrayList<Integer>(temp));
				temp.clear();
				if (!queue.isEmpty())
					queue.add(null);
			} else {
				if (ans.size() % 2 == 0) {
					temp.add(node.val);
				} else {
					temp.addFirst(node.val);
				}
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
		}
		return ans;
	}

	public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null)
			return ans;
		List<Integer> temp = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				TreeNode node = queue.poll();
				if (ans.size() % 2 == 0) {
					temp.add(node.val);
				} else {
					temp.addFirst(node.val);
				}
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			ans.add(new ArrayList<Integer>(temp));
			temp.clear();

		}
		return ans;
	}
}
