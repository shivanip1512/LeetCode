package leetcode.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Solution_987 {
	class Element {
		TreeNode node;
		Integer dist, level;

		Element(TreeNode node, Integer dist, Integer level) {
			this.node = node;
			this.dist = dist;
			this.level = level;
		}
	}

	public List<List<Integer>> verticalTraversal(TreeNode root) {
		if (root == null)
			return new ArrayList<>();

		  // Column -> Level -> Nodes
	    TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
		Queue<Element> queue = new LinkedList<>();
		queue.add(new Element(root, 0, 0));

		while (!queue.isEmpty()) {
			Element curr = queue.poll();
			TreeNode node = curr.node;
			int dist = curr.dist;
			int level = curr.level;

			map.putIfAbsent(dist, new TreeMap<>());
			map.get(dist).putIfAbsent(level, new ArrayList<>());
			map.get(dist).get(level).add(node.val);

			// Left to right is key
			if (node.left != null)
				queue.add(new Element(node.left, dist - 1, level + 1));
			if (node.right != null)
				queue.add(new Element(node.right, dist + 1, level + 1));
		}

		List<List<Integer>> result = new ArrayList<>();
		for (TreeMap<Integer, List<Integer>> levelMap : map.values()) {
			List<Integer> column = new ArrayList<>();
			for (List<Integer> nodesAtLevel : levelMap.values()) {
				Collections.sort(nodesAtLevel);
				column.addAll(nodesAtLevel);
			}
			result.add(column);
		}

		return result;
	}
}
