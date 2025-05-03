package leetcode.trees;

import leetcode.ListNode.ListNode;

public class Solution_206 {

	public static void main(String[] args) {
		//	[5,6,1,8,4,5]
		ListNode headA = new ListNode(5,
				new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
		reverseList(headA);
		
	}

    public static ListNode reverseList(ListNode head) {
    	ListNode curr=head, prev=null;
    	while(curr!=null) {
    		ListNode n = curr.next;
    		curr.next = prev;

    		prev=curr;
    		curr=n;
    	}
    	
		return head;
    }
}
