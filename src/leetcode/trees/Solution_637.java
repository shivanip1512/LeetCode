package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_637 {
	public List<Double> averageOfLevels(TreeNode root) {
		if (root == null)
			return null;

		List<Double> avg_list = new ArrayList<Double>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();
			double elements = (double) q.size();
			long sum = 0;
			while (size-- > 0) {
				TreeNode treeNode = q.poll();
				sum += treeNode.val;
				if (treeNode.left != null)
					q.add(treeNode.left);
				if (treeNode.right != null)
					q.add(treeNode.right);
			}
			avg_list.add(sum / elements);
		}
		return avg_list;
	}
}
