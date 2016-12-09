package leetcode.ex136;

import java.util.HashMap;

public class Solution {
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> table = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (table.get(nums[i]) != null) {
				table.put(nums[i], table.get(nums[i]) + 1);
			} else {
				table.put(nums[i], 1);
			}
		}
		for (int i : table.keySet()) {
			if (table.get(i) == 1) {
				return i;
			}
		}
		return 0;
    }
}
