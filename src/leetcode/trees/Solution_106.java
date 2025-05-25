package leetcode.trees;

import java.util.HashMap;
import java.util.Map;

public class Solution_106 {
	private Map<Integer, Integer> inorderMap = new HashMap<>();

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length != postorder.length)
			return null;

		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		return buildTreeHelper(postorder, 0, postorder.length - 1, 0);
	}

	private TreeNode buildTreeHelper(int[] postorder, int postStart, int postEnd, int inStart) {
		if (postStart > postEnd)
			return null;

		int rootVal = postorder[postEnd];

		int inRootIdx = inorderMap.get(rootVal);

		int size = (inRootIdx) - inStart;
		int leftInStart = inStart;
		int leftPostStart = postStart;
		int leftPostEnd = postStart + size - 1;

		int rightPostStart = postStart + size;
		int rightPostEnd = postEnd - 1;
		int rightInStart = inRootIdx + 1;

		TreeNode root = new TreeNode(rootVal);
		root.left = buildTreeHelper(postorder, leftPostStart, leftPostEnd, leftInStart);
		root.right = buildTreeHelper(postorder, rightPostStart, rightPostEnd, rightInStart);

		return root;
	}
}
