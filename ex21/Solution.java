package leetcode.ex21;

public class Solution {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(6);
		ListNode c = new ListNode(89);
		a.next = b;
		b.next = c;
		
		ListNode d = new ListNode(6);
		ListNode e = new ListNode(8);
		ListNode f = new ListNode(11);
		d.next = e;
		e.next = f;
		
		Solution solution = new Solution();
		a = solution.mergeTwoLists(c.next, d);
		while (a != null) {
			System.out.print(a.val + ",");
			a = a.next;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(1);
        ListNode head_bak = head;
        while (l1 != null && l2 != null) {
        	if (l1.val <= l2.val) {
				head.next = l1;
				l1 = l1.next;
			} else {
				head.next = l2;
				l2 = l2.next;
			}
        	head = head.next;
		}
        
        if (l1 == null) {
			head.next = l2;
		} else {
			head.next = l1;
		}
        
        return head_bak.next;
    }
}
