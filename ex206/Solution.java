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
		ListNode pre, now, succ;
		if (head == null || head.next == null) {
			return head;
		}
		return null;
    }
}
