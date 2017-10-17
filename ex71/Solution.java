package leetcode.ex71;

import java.util.Stack;

public class Solution{
    public String simplifyPath(String path) {
        String [] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; i ++){
            if (strs[i].equals("..")){
                if (stack.size() > 0){
                    stack.pop();
                }
            } else if (strs[i].equals(".") || strs[i].length() == 0){
                continue;
            } else {
                stack.push(strs[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() != 0){
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}