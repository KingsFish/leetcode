package leetcode.ex442;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int [] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
			if (temp[nums[i]] == 1) {
				result.add(nums[i]);
			} else {
				temp[nums[i]] = 1;
			}
		}
        return result;
    }
	public List<Integer> findDuplicates_v2(int[] nums) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				result.add(i);
			} else {
				nums[index] = -nums[index];
			}
		}
		return result;
	}
}
