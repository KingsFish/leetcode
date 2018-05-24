package leetcode.ex784;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        ArrayList<String> res = new ArrayList<>();
        if (S == null || S.length() == 0) {
            res.add("");
            return res;
        }
        S = S.toLowerCase();
        res.add("" + S.charAt(0));
        if (isChar(S.charAt(0))) {
            char cs = (char)(S.charAt(0) - 'a' + 'A');
            res.add(cs + "");
        } 
        for (int i = 1; i < S.length(); i ++) {
            res = addChar(S.charAt(i), res);
        }
        return res;
    }
    
    private boolean isChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
    
    private ArrayList<String> addChar(char c, ArrayList<String> res) {
        ArrayList<String> tmp = new ArrayList<>();
        int j = 0;
        while(j < res.size()) {
            tmp.add(res.get(j) + c);
            if(isChar(c)) {
                char cs = (char)(c - 'a' + 'A');
                tmp.add(res.get(j) + cs);
            }
            j ++;
        }
        return tmp;
    }
}