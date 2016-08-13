package leetcode.ex203;

public class Solution {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		System.out.println(removeElements_v1(a, 2));
	}
	
	public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head = newHead;
        while (head.next != null){
            if (head.next.val == val){
               head.next = head.next.next;
            }
            head = head.next;
        }
        return newHead.next;
    }
	
	public static ListNode removeElements_v1(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode pred = newHead;
        while(head != null){
            if (head.val == val){
            	if (head.next == null) {
					pred.next = null;
					break;
				} else {
					head.val = head.next.val;
					head.next = head.next.next;
				}
            } else {
                pred = head;
                head = head.next;
            }
        }
        return newHead.next;
    }
	
	
}
