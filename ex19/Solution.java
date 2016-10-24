package leetcode.ex19;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode head_bak = head;
		int size = 0;
        while (head != null) {
        	size ++;
			head = head.next;
		}
        if (size == 0) {
			return head;
		} else if (size == n) {
			return head_bak.next;
		}
        int temp = 0;
        head = head_bak;
        while (head != null) {
        	if (temp == size - n - 1) {
        		if (head.next.next == null) {
					head.next = null;
				}
			} else if (temp == size - n) {
				head.val = head.next.val;
				head.next = head.next.next;
			}
			head = head.next;
        	temp ++;
		}
        return head_bak;
    }
}
