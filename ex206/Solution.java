package leetcode.ex206;

public class Solution {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = null;
		ListNode head = reverseList(node);
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		int size = 0;
		ListNode head_bak = head;
        while (head != null) {
        	size ++;
        	head = head.next;
		}
        if (size == 0) {
			return head_bak;
		}
        head = head_bak;
        ListNode [] stack = new ListNode[size]; 
        int i = 0;
        while (head != null) {
        	stack[i] = head;
        	head = head.next;
        	i ++;
		}
        i = i - 1;
        for (; i > 0; i --) {
			stack[i].next = stack[i - 1];
		}
        stack[0].next = null;
        return stack[stack.length - 1];
    }
}
