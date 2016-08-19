package leetcode.ex24;

public class Solution {
	
	public ListNode swapPairs(ListNode head) {
        int i = 0;
        ListNode head_bak = head;
        ListNode first = null;
        ListNode second = null;
        while (head != null) {
        	if (i % 2 == 0) {
				first = head;
			} else {
				second = head;
			}
        	head = head.next;
        	i ++;
        	if (first != null && second != null) {
				int temp = first.val;
				first.val = second.val;
				second.val = temp;
				first = null;
				second = null;
			}
		}
        return head_bak;
    }
}
