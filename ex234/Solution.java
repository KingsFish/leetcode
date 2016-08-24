package leetcode.ex234;

public class Solution {

	public boolean isPalindrome(ListNode head) {
		int size = 0;
		ListNode headBak = head;
        while (head != null) {
			size ++;
        	head = head.next;
		}
        ListNode [] stack = new ListNode[size / 2];
        head = headBak;
        int i = 0;
        while (head != null) {
        	if (i == stack.length) {
				break;
			}
        	stack[i] = head;
        	i ++;
        	head = head.next;
		}
        if (size % 2 == 1) {
			head = head.next;
		}
        i --;
        boolean isPalindrome = true;
        while (head != null) {
        	if (head.val != stack[i].val) {
				isPalindrome = false;
				break;
			}
        	i --;
        	head = head.next;
		}
        return isPalindrome;
    }
	
}
