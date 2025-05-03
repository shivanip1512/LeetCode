package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

import leetcode.ListNode.ListNode;

public class Solution_160 {

	public static void main(String[] args) {
		// [5,6,1,8,4,5]
		ListNode headA = new ListNode(5,
				new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));

		// [4,1,8,4,5]
		ListNode headB = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));

		ListNode intersectionNode = getIntersectionNode(headA, headB);
		System.out.println(intersectionNode);
	}


	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		/*
		 * //1. BRUTE FORCE 
		 * while (headA != null) { ListNode head2 = headB; while (head2
		 * != null) { if (headA.equals(head2)) { return headA; } head2 = head2.next; }
		 * headA = headA.next; }
		 */

		/*
		 * // 2. Using List 
		 * List<ListNode> visited = new ArrayList<ListNode>(); while
		 * (headB != null) { visited.add(headB); headB = headB.next; } while (headA !=
		 * null) { if (visited.contains(headA)) return headA; headA = headA.next; }
		 */

		int lengthA = length(headA);
		int lengthB = length(headB);

		int diff = Math.abs(lengthA - lengthB);
		if (lengthA > lengthB) {
			ListNode temp = headA;
			headA = headB;
			headB = temp;
		}

		// headB is bigger
		for (int i = 0; i < diff; i++) {
			headB = headB.next;
		}

		// Now both A and B are equi-distant from intersection point
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;

			headA = headA.next;
			headB = headB.next;
		}

		return null;
	}

	static int length(ListNode l) {
		int count = 0;
		while (l != null) {
			count++;
			l = l.next;
		}
		return count;
	}
}
