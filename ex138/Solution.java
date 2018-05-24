package leetcode.ex138;

import java.util.HashMap;

public class Solution {
	
    // better
    public RandomListNode copyRandomList_v2(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode head_bak = head;
        
        // copy node
        while (head != null) {
            RandomListNode tmp = new RandomListNode(head.label);
            tmp.next = head.next;
            head.next = tmp;
            head = tmp.next;
        }
        head = head_bak;
        // copy random
        while(head != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
        head = head_bak;
        
        // get new list
        RandomListNode res = head.next;
        RandomListNode tmp = head.next;
        head.next = tmp.next;
        head = head.next;
        while (head != null) {
            tmp.next = head.next;
            tmp = tmp.next;
            head.next = tmp.next;
            head = tmp.next;
        }
        return res;
    }
    
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
