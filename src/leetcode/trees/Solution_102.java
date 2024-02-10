package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution_102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> tree_list = new ArrayList<>();
		if(root==null)
			return tree_list;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> curr_level = new ArrayList<Integer>();
			while (size-- > 0) {
				TreeNode treeNode = queue.poll();
				curr_level.add(treeNode.val);
				if (treeNode.left != null)
					queue.add(treeNode.left);
				if (treeNode.right != null)
					queue.add(treeNode.right);
			}
			tree_list.add(curr_level);
		}
		return tree_list;
	}
}