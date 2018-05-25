package leetcode.ex47;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        permutation(res, nums, 0, set);
        return res;
    }
    
    private void permutation(List<List<Integer>> res, int [] nums,
                             int start, HashSet<String> set) {
        if (start == nums.length - 1) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i : nums) {
                sb.append(i + ",");
                tmp.add(i);
            }
            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                res.add(tmp);
            }
        }
        for (int i = start; i < nums.length; i ++) {
            swap(nums, start, i);
            permutation(res, nums, start + 1, set);
            swap(nums, start, i);
        }
    }
    
    private void swap(int [] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}