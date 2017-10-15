package leetcode.ex147;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode result = head;
        if (head != null){
            head = head.next;
            ListNode tmp = head;
            while (head != null) {
                tmp = result;
                while (tmp.val < head.val){
                    tmp = tmp.next;
                }
                while (tmp != head){
                    swap(tmp, head);
                    tmp = tmp.next;
                }
                head = head.next;
            }
        }
        return result;
    }
    private void swap(ListNode a, ListNode b){
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}