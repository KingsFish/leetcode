package leetcode.ex771;

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : J.toCharArray()){
            set.add(c);
        }
        for (char c : S.toCharArray()){
            if (set.contains(c)) {
                res ++;
            }
        }
        return res;
    }
}