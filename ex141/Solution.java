package leetcode.ex141;

public class Solution {
	
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
        ListNode fast = head;
        do{
            slow = slow.next;
            fast = (fast == null) ? null : fast.next;
            fast = (fast == null) ? null : fast.next;
        } while(!(slow == fast));
        
        if (slow == null) {
			return false;
		} else {
			return true;
		}
    }

}
