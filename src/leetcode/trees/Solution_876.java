package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode middleNode(ListNode head) {
		ListNode slow = head, fast = head.next;
		/*
		 * while (fast != null) 
		 * { slow = slow.next; if (fast.next == null) break; 
		 * fast = fast.next.next; }
		 */
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		// even length
		if(fast.next==null)
			return slow.next;
		
		return slow;
	}
}
