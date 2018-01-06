package leetcode.ex382;


import leetcode.ListNode;

public class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    
    ListNode head;
    Random rnd;
    public Solution(ListNode head) {
        this.head = head;
        this.rnd = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int count = 1;
        int result = 0;
        ListNode head_bak = head;
        while(head_bak != null){
            if (rnd.nextInt(count++) == 0){
                result = head_bak.val;
            }
            head_bak = head_bak.next;
        }
        return result;
    }
}