package leetcode.ex20;

public class Solution {
	
	public boolean isValid(String s) {
		char [] list = s.toCharArray();
        if (list.length % 2 != 0) {
			return false;
		}
        char [] stack = new char[list.length / 2 + 1];
        int top = -1;
        int i = 0;
        while (top < stack.length + 1 && i < list.length) {
			switch (list[i]) {
			case '(':
			case '{':
			case '[':
				stack[++top] = list[i];
				break;
			case ')':
				if (top == -1) {
					return false;
				}
				if (stack[top] != '(') {
					return false;
				}
				top --;
				break;
			case '}':
				if (top == -1) {
					return false;
				}
				if (stack[top] != '{') {
					return false;
				}
				top --;
				break;
			case ']':
				if (top == -1) {
					return false;
				}
				if (stack[top] != '[') {
					return false;
				}
				top --;
				break;
			}
        	i ++;
		}
        if (top != -1) {
			return false;
		} else {
			return true;
		}
    }
}
