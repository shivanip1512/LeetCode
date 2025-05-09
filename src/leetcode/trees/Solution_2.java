package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		int carry = 0;

		ListNode head = null;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			ListNode temp = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = head;
			head = temp;
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int sum = l1.val + carry;
			ListNode temp = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = head;
			head = temp;
			l1 = l1.next;
		}

		while (l2 != null) {
			int sum = l2.val + carry;
			ListNode temp = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = head;
			head = temp;
			l2 = l2.next;
		}

		if (carry > 0) {
			ListNode temp = new ListNode(carry);
			temp.next = head;
			head = temp;
		}

		// reverse
		ListNode prev = null, curr = head;

		while (curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;

		return head;
	}
}
