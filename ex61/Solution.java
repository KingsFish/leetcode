package leetcode.ex61;

public class Solution {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		head.next = a;
		a.next = null;
		
		ListNode temp = rotateRight(head, 2);
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}

	public static ListNode rotateRight(ListNode head, int k) {
        ListNode head_bak = head;
        int size = 1;
        if (head == null || head.next == null) {
			return head;
		}
        while (head.next != null) {
        	size ++ ;
        	head = head.next;
		}
        k = k % size;
        if (k <= 0) {
			return head;
		}
        ListNode last = head;
        ListNode last_k = null;;
        head = head_bak;
        
        int i = 0;
        while (head != null) {
        	if (i == size - k - 1) {
        		last_k = head;
        		head = head.next;
        		break;
			}
        	i ++;
        	head = head.next;
		}
        last.next = head_bak;
        last_k.next = null;
        
        return head;
    }
}
