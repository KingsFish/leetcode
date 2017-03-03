package leetcode.ex160;

public class Solution {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/*
		 * 设定两个节点a和b，a遍历headA到headB，b遍历headB到headA，遍历总长度一样，但是由于两链表有重合的
		 * 地方，所以最终a和b将会重合在headA和headB相交的节点 
		 */
        if (headA == null || headB == null) {
			return null;
		}
        ListNode a = headA, b = headB;
        while (a != b) {
        	a = a == null ? headB : a.next;
        	b = b == null ? headA : b.next;
		}
        return a;
    }

}
