package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break; // loop detected
		}

		if (fast == null || fast.next == null) {
			return null;
		}

		// size of loop
		fast = fast.next;
		int count = 1;
		while (slow != fast) {
			fast = fast.next;
			count++;
		}

		slow = fast = head;
		while (count-- > 0) {
			fast = fast.next;
		}

		// move both pointer at same speed
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}
}
