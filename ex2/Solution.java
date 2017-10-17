package leetcode.ex2;

import leetcode.ListNode;

public class Solution{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode result = new ListNode(1);
	    ListNode root = result;
	    int carry = 0;
	    while(l1 != null || l2 != null || carry != 0){
	        int a = l1 == null ? 0 : l1.val;
	        int b = l2 == null ? 0 : l2.val;
	        int sum = a + b + carry;
	        carry = sum / 10;
	        ListNode tmp = new ListNode(sum % 10);
	        root.next = tmp;
	        root = tmp;
	        l1 = l1 == null ? null : l1.next;
	        l2 = l2 == null ? null : l2.next;
	    }
	    return result.next;
	}
}


