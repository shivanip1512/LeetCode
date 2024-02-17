package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> node_list = new ArrayList<List<Integer>>();
		if (root == null)
			return node_list;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		Stack<List<Integer>> bfs_elemets = new Stack<List<Integer>>();

		while (!q.isEmpty()) {
			int elements = q.size();
			List<Integer> list = new ArrayList<Integer>();
			while (elements-- > 0) {
				TreeNode treeNode = q.poll();
				list.add(treeNode.val);
				if (treeNode.left != null)
					q.add(treeNode.left);
				if (treeNode.right != null)
					q.add(treeNode.right);
			}
			bfs_elemets.add(list);
		}
		
		while(!bfs_elemets.isEmpty()) {
			node_list.add(bfs_elemets.pop());
		}

		return node_list;
	}
}
