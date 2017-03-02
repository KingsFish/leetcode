package leetcode.ex225;

import java.util.ArrayDeque;

public class MyStack {
	
	public ArrayDeque<Integer> queue;
	/** Initialize your data structure here. */
    public MyStack() {
    	queue = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	queue.addFirst(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.pollFirst();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.getFirst();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
	
	
}
