package leetcode.ex142;

import leetcode.ListNode;

public class Solution {
	
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return null;
		}
        ListNode slow = head;
        ListNode fast = head;
        do {
        	slow = slow.next;
        	fast = fast == null ? null : fast.next;
        	fast = fast == null ? null : fast.next;
		} while (!(slow == fast));
        if (slow == null) {
			return null;
		}
        fast = head;
        while (fast != slow) {
        	slow = slow.next;
        	fast = fast.next;
		}
        return slow;
    }
}
