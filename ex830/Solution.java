package leetcode.ex830;

import java.utils.List;
import java.utils.ArrayList;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        char [] chars = S.toCharArray();
        int start = 0, end = 0;
        for (int i = 1; i < S.length(); i ++) {
            if (chars[start] == chars[i]) {
                end = i;
            } else {
                addOrNot(res, start, end);
                start = i;
                end = i;
            }
        }
        addOrNot(res, start, S.length() - 1);
        return res;
    }
    private void addOrNot(List<List<Integer>> res, int start, int end) {
        if (end - start >= 2) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(start);
            tmp.add(end);
            res.add(tmp);
        }
    }
}