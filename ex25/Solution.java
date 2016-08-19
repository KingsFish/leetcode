package leetcode.ex25;

public class Solution {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = null;
		ListNode head = reverseKGroup(b, 2);
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || head.next == null || k == 1) {
			return head;
		}
		ListNode head_bak = head;
		ListNode [] stack = new ListNode[k];
		ListNode last_last = null;
		boolean isFirst = true;
		int i = 0;
		int top = -1;
		while (head != null) {
			top ++;
			stack[top] = head;
			i ++;
			head = head.next;
			if (i % k == 0) {
				if (isFirst) {
					head_bak = stack[top];
					isFirst = false;
				} else {
					last_last.next = stack[top];
				}
				for (int j = top; j > 0; j--) {
					stack[j].next = stack[j - 1];
				}
				stack[0].next = head;
				top = -1;
				last_last = stack[0];
			}
		}
		return head_bak;
	}
}
