package leetcode.ex682;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String c : ops){
            if(c.equals("+")){
                int tmp = stack.pop();
                tmp += stack.peek();
                stack.push(tmp - stack.peek());
                stack.push(tmp);
                sum += stack.peek();
            } else if (c.equals("C")){
                sum -= stack.pop();
            } else if (c.equals("D")){
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else {
                stack.push(Integer.valueOf(c));
                sum += stack.peek();
            }
        }
        return sum;
    }
}