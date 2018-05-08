package leetcode.ex821;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] shortestToChar(String S, char C) {
        int [] res = new int[S.length()];
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < S.length(); i ++) {
            if (S.charAt(i) == C) {
                pos.add(i);
            }
        }
        for (int i = 0; i < res.length; i ++) {
            res[i] = res.length - 1;
            for (int j = 0; j < pos.size(); j ++) {
                res[i] = Math.min(Math.abs(pos.get(j) - i), res[i]);
            }
        }
        return res;
    }
}