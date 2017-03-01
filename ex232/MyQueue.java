package leetcode.ex232;

import java.util.Stack;

public class MyQueue {
	
	public Stack<Integer> stack;
	public Stack<Integer> stack_reverse;
	public MyQueue() {
		stack = new Stack<>();
		stack_reverse = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack.isEmpty()) {
        	stack_reverse.push(stack.pop());
		}
        stack.push(x);
        while (!stack_reverse.empty()) {
        	stack.push(stack_reverse.pop());
		}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack.isEmpty();
    }
}
