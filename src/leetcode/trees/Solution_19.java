package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_19 {
	public static void main(String[] args) {

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode f = head, l = head;
		
		while (n-- > 0) {
			l = l.next;
		}

		// n happen to be 1st node, hence remove 1st node
		if (l == null)
			return f.next;

		while (l.next != null) {
			f = f.next;
			l = l.next;
		}

		f.next = f.next.next;
		return head;
	}
}
