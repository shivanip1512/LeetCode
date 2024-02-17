package leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_1161 {
	public int maxLevelSum(TreeNode root) {
		if (root == null)
			return 0;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int max_sum_level = 0, level = 0;
		long max_sum = Integer.MIN_VALUE;

		while (!q.isEmpty()) {
			int size = q.size();
			level++;
			long sum = 0;

			while (size-- > 0) {
				TreeNode node = q.poll();
				sum += node.val;
				if (node.left != null) q.add(node.left);
				if (node.right != null) q.add(node.right);
			}

			if (max_sum < sum) {
				max_sum = sum;
				max_sum_level = level;
			}
		}

		return max_sum_level;
	}
}
