package leetcode.ex155;

public class MinStack {
	
	private final int DEFAULT_CAPACITY = 10;
	int [] stack;
	int top;
	int size;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new int [DEFAULT_CAPACITY];
        top = -1;
        size = DEFAULT_CAPACITY;
    }
    
    public void push(int x) {
        if (top + 1 >= size) {
			int [] temp = new int[size * 2];
			for (int i = 0; i < size; i++) {
				temp[i] = stack[i];
			}
			stack = temp;
			size *= 2;
		}
        top ++;
        stack[top] = x;
    }
    
    public void pop() {
        top --;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
    	int min = Integer.MAX_VALUE;
        for (int i = 0; i <= top; i++) {
			if (min > stack[i]) {
				min = stack[i];
			}
		}
        return min;
    }
}
