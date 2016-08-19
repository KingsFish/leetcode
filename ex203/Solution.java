package leetcode.ex203;

public class Solution {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		a.next = b;
		b.next = c;
		ListNode head = removeElements_v1(a, 4);
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
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
