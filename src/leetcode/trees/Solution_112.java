package leetcode.trees;
import java.util.Stack;

class Solution {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;

		Stack<TreeNode> node_stack = new Stack<TreeNode>();
		Stack<Integer> curr_sum_left_stack = new Stack<Integer>();

		node_stack.add(root);
		curr_sum_left_stack.add(targetSum-root.val);
		
		while(!node_stack.isEmpty()) {
			TreeNode treeNode = node_stack.pop();
			Integer curr_sum = curr_sum_left_stack.pop();
			
			if(curr_sum==0 && treeNode.left==null && treeNode.right==null)
				return true;
			
			if(treeNode.left !=null && curr_sum-treeNode.left.val>=0) {
				node_stack.add(treeNode.left);
				curr_sum_left_stack.add(curr_sum-treeNode.left.val);
			}
			
			if(treeNode.right !=null && curr_sum-treeNode.right.val>=0) {
				node_stack.add(treeNode.right);
				curr_sum_left_stack.add(curr_sum-treeNode.right.val);
			}
		}
		return false;
	}
}