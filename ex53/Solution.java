package leetcode.ex53;

public class Solution {
	public int maxSubArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		int min = 0;
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (result < nums[i] - min) {
				result = nums[i] - min;
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return result;
    }
}
