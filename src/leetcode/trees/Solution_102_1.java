package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution_102_1 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (root == null)
			return ans;
		List<Integer> temp = new ArrayList<Integer>();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			if (poll == null) {
				System.out.println(temp);
				ans.add(new ArrayList<>(temp));
	            temp.clear();
				if (!queue.isEmpty())
					queue.add(null);
			} else {
				temp.add(poll.val);
				if (poll.left != null)
					queue.add(poll.left);
				if (poll.right != null)
					queue.add(poll.right);
			}
		}
		return ans;
	}
}