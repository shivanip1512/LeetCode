package leetcode.trees;

import java.util.HashMap;
import java.util.Map;

public class Solution_105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null || preorder.length != inorder.length)
			return null;
		return buildTreeHelper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
	}

	private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preStartIndex, int preEndIndex,
			int inStartIndex, int inEndIndex) {
		if (inStartIndex > inEndIndex)
			return null;

		int rootVal = preorder[preStartIndex];

		int leftInStartIdx = inStartIndex;
		int leftInEndIdx = findElement(inorder, rootVal);
		int leftPreStartIdx = preStartIndex + 1;
		int leftPreEndIdx = leftPreStartIdx + (leftInEndIdx - leftInStartIdx);

		int rightPreStartIdx = leftPreEndIdx + 1;
		int rightPreEndIdx = preEndIndex;
		int rightInStartIdx = leftInEndIdx + 2;
		int rightInEndIdx = inEndIndex;

		TreeNode root = new TreeNode(rootVal);
		root.left = buildTreeHelper(preorder, inorder, leftPreStartIdx, leftPreEndIdx, leftInStartIdx, leftInEndIdx);
		root.right = buildTreeHelper(preorder, inorder, rightPreStartIdx, rightPreEndIdx, rightInStartIdx,
				rightInEndIdx);
		return root;
	}

	private int findElement(int[] inorder, int rootVal) {
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == rootVal)
				return i - 1;
		}
		return 0;
	}
	
	
	// Optimized code
	private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length)
            return null;

        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTreeHelper1(preorder, 0, preorder.length - 1, 0);
    }

    private TreeNode buildTreeHelper1(int[] preorder, int preStart, int preEnd, int inStart) {
        if (preStart > preEnd)
            return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int rootIndexInInorder = inorderIndexMap.get(rootVal);
        int leftSize = rootIndexInInorder - inStart;

        root.left = buildTreeHelper1(preorder, preStart + 1, preStart + leftSize, inStart);
        root.right = buildTreeHelper1(preorder, preStart + leftSize + 1, preEnd, rootIndexInInorder + 1);

        return root;
    }
}
