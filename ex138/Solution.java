package leetcode.ex138;

import java.util.HashMap;

public class Solution {
	
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return null;
		}
		HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode tmp = head;
		while (tmp != null) {
			map.put(tmp, new RandomListNode(tmp.label));
			tmp = tmp.next;
		}
		tmp = head;
		while (tmp != null) {
			map.get(tmp).next = map.get(tmp.next);
			map.get(tmp).random = map.get(tmp.random);
			tmp = tmp.next;
		}
		return map.get(head);
    }	

}
