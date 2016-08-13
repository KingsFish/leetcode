package leetcode.ex150;

public class Solution {
	
	public static void main(String[] args) {
		String [] eval = new String []{"0", "65525", "/"};
		Solution solution = new Solution();
		System.out.println(solution.evalRPN(eval));
	}
	
	public int evalRPN(String[] tokens) {
		int [] stack = new int[tokens.length / 2 + 1];
		int top = -1;
		for (String str : tokens) {
			switch (str) {
				case "+":
					stack[top - 1] = stack[top - 1] + stack[top];
					top --;
					break;
				case "-":
					stack[top - 1] = stack[top - 1] - stack[top];
					top --;
					break;
				case "*":
					stack[top - 1] = stack[top - 1] * stack[top];
					top --;
					break;
				case "/":
					stack[top - 1] = stack[top - 1] / stack[top];
					top --;
					break;
				default:
					stack[++top] = Integer.parseInt(str);
					break;
			}
		}
		return stack[top];
    }
}
