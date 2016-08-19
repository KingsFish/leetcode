package leetcode.ex83;


public class Solution {
	
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
			return head;
		}
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null) {
        	if (fast.val != slow.val) {
				if (!(fast.equals(slow.next))) {
					slow.next = fast;
				}
        		slow = slow.next;
			}
        	fast = fast.next;
		}
        slow.next = null;
        return head;
    }
}
