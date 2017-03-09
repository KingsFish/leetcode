package leetcode.ex414;

import java.util.Arrays;

public class Solution {
	public int thirdMax(int[] nums) {
		int max = Integer.MAX_VALUE, temp = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int i = nums.length - 1;
		if (nums.length <= 2) {
			return nums[i];
		}
		max = nums[i--];
		while (i >= 0 && max == nums[i]) {
			i --;
		}
		if (i < 0) {
			return max;
		}
		temp = nums[i--];
		while (i >= 0 && temp == nums[i]) {
			i --;
		}
		if (i < 0) {
			return max;
		}
		return nums[i];
    }
}
