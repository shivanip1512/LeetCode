package leetcode.ListNode;

//  Definition for singly-linked list. 
public class ListNode {
	int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	public ListNode(int x, ListNode n) {
		val = x;
		next = n;
	}

	@Override
	public String toString() {
		return String.valueOf(val);
	}

	public boolean equals(ListNode obj) {
		// TODO Auto-generated method stub
		return this.val == obj.val && this.next.val == obj.next.val;
	}
}
