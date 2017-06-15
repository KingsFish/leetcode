package leetcode.ex198;

public class Solution {
	
	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
        if (nums.length == 1) {
			return nums[0];
		}
        if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
        int x = nums[0], y = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
        	int tmp = y;
        	y = Math.max(y, x + nums[i]);
        	x = tmp;
		}
        return y;
    }
}
