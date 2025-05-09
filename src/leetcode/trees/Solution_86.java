package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode partition(ListNode head, int x) {
		ListNode lessHead = null, lessTail = null, moreHead = null, moreTail = null;

		while (head != null) {
			if (head.val < x) {
				if (lessHead == null) {
					lessHead = lessTail = head;
				} else {
					lessTail.next = head;
					lessTail = lessTail.next;
				}
			} else {
				if (moreHead == null) {
					moreHead = moreTail = head;
				} else {
					moreTail.next = head;
					moreTail = moreTail.next;
				}
			}
			head = head.next;
		}

		if (lessHead != null && moreHead == null) {
			lessTail.next = null;
			return lessHead;
		}
		if (lessHead == null && moreHead != null) {
			moreTail.next = null;
			return moreHead;
		}

		lessTail.next = moreHead;
		moreTail.next = null;
		return lessHead;
	}
}
