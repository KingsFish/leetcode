package leetcode.ex143;

public class Solution {

	public static void main(String[] args) {
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		ListNode e = new ListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		reorderList(a);
		while (a != null) {
			System.out.print(a.val + ",");
			a = a.next;
		}
	}
	
	public static void reorderList(ListNode head) {
		//分三步，第一步遍历得到整体长度
        int size = 0;
        ListNode head_bak = head;
        while (head != null) {
        	size ++;
        	head = head.next;
		}
        
        if (size == 0) {
			return;
		}
        
        //第二步 将后半部分的链表使用一个数组模仿的栈存储
        head = head_bak;
        
        ListNode [] stack = new ListNode[size / 2];
        int i = 0;
        
        int begin = size % 2 == 0 ? size / 2 : (size + 1) / 2;//后半部分的开始
        while (head != null) {
        	if (i >= begin) {
        		stack[i - begin] = head;
			}
        	i ++;
        	head = head.next;
		}
        head = head_bak;
        
        //第三步 不断弹栈完成要求
        i -= begin + 1;
        while (i >= 0) {
        	stack[i].next = head.next;
        	head.next = stack[i];
        	i --;
        	head = head.next.next;
		}
        head.next = null;
    }
}
