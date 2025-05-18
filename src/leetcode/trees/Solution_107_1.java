package leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution_107_1 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null) return new ArrayList<>();
        
        queue.add(root);
        queue.add(null);
        
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            
            if (poll == null) {
                // Push the current level to stack
                stack.push(new ArrayList<>(temp));
                temp.clear();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                temp.add(poll.val);
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
            }
        }
        
        // Build the result list from the stack
        List<List<Integer>> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
        
        return ans;
    }
}
