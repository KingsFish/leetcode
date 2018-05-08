package leetcode.ex762;

import java.util.HashSet;

class Solution {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        while(L <= R) {
            if (set.contains(Integer.bitCount(L))) {
                res ++;
            }
            L ++;
        }
        return res;
    }
}