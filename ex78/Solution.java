package leetcode.ex78;

import java.util.List;
import java.util.ArrayList;

class Solution {
    List<List<Integer>> res = null;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        sets(nums, 0, tmp);
        return res;
    }
    
    private void sets(int [] nums, int pos, List<Integer> set) {
        List<Integer> tmp = new ArrayList<>();
        tmp.addAll(set);
        tmp.add(nums[pos]);
        if (pos != nums.length - 1) {
            sets(nums, pos + 1, set);
            sets(nums, pos + 1, tmp);
        } else {
            res.add(set);
            res.add(tmp);
        }
    }
}