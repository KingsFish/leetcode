package leetcode.ex23;

public class Solution {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		} else if (lists.length == 1) {
			return lists[0];
		}
        return sort(lists, 0, lists.length - 1);
    }	
	
	private ListNode sort(ListNode [] list, int begin, int end){
		if (end == begin) {
			return list[begin];
		} else if (end - begin == 1) {
			return mergeList(list[begin], list[end]);
		} else {
			int mi = begin + (end - begin) / 2;
			ListNode a = sort(list, begin, mi - 1);
			ListNode b = sort(list, mi, end);
			return mergeList(a, b);
		}
	}
	
	private ListNode mergeList(ListNode a, ListNode b){
		ListNode head = new ListNode(0);
		ListNode head_bak = head;
		while (a != null && b != null) {
			if (a.val < b.val) {
				head.next = a;
				a = a.next;
				head = head.next;
			} else {
				head.next = b;
				b = b.next;
				head = head.next;
			}
		}
		if (a != null) {
			head.next = a;
		} else {
			head.next = b;
		}
		return head_bak.next;
	}
}
