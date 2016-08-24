package leetcode.ex328;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		
		ListNode head = solution.oddEvenList(a);
		while (head != null){
			System.out.print(head.val);
			head = head.next;
		}
	}
	
	public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
			return head;
		}
        ListNode headBak = head;
        ListNode oddFirst = head;
        ListNode evenFirst = head.next;
        ListNode evenFirstBak = evenFirst;
        int i = 3;
        head = head.next.next;
        while (head != null) {
        	if (i % 2 == 1) {
				//奇数
        		oddFirst.next = head;
        		oddFirst = head;
			} else {
				//偶数
				evenFirst.next = head;
				evenFirst = head;
			}
        	i ++;
        	head = head.next;
		}
        oddFirst.next = evenFirstBak;
        evenFirst.next = null;
        return headBak;
    }
}
