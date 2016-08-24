package leetcode.ex82;

public class Solution {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		ListNode head = Solution.deleteDuplicates(a);
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
		
	}

	public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
			return head;
		}
        ListNode slow = new ListNode(99);
        ListNode headBak = slow;
        slow.next = head;
        ListNode fast = head.next;
        
        boolean isRepeat = false;
        while (fast != null) {
        	if (fast.val == slow.next.val) {
        		isRepeat = true;
			} else {
				if (!isRepeat) {
					slow = slow.next;
				} else {
					slow.next = fast;
					isRepeat = false;
				}
			}
        	fast = fast.next;
		}
        if (!isRepeat) {
        	slow.next.next = null;
		} else {
			slow.next = null;
		}
        return headBak.next;
    }
}
