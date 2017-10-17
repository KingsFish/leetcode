package leetcode.ex61;

public class Solution {
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		
		ListNode temp = rotateRight(c, 2);
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}

	public static ListNode rotateRight(ListNode head, int k) {
		int size = 0;
        ListNode head_bak = head;
        while (head != null) {
        	size ++;
        	head = head.next;
		}
        if (size <= 1) {
			return head_bak;
		}
        k = k % size;
        ListNode [] stack = new ListNode[size];
        head = head_bak;
        for (int i = 0; i < size; i++) {
			stack[i] = head;
			head = head.next;
		}
        
        stack[size - 1].next = stack[0];
        stack[size - k - 1].next = null;
        return stack[(size - k) % size];
    }
}
