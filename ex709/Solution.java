package leetcode.ex709;

import java.util.StringBuilder;

class Solution {
    public String toLowerCase(String str) {
        StringBuilder sv = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c <= 'Z' && c >= 'A') {
                char tmp = (char)(c + 'a' - 'A');
                sv.append(tmp);
            } else {
                sv.append(c);
            }
        }
        return sv.toString();
    }
}