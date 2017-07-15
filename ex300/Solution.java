package leetcode.ex300;

import java.util.Arrays;

public class Solution {

	public int lengthOfLIS(int[] nums) {
        int [] result = new int [nums.length];
        int max = 0;
        for (int i = 0; i < result.length; i++) {
			result[i] = 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					result[i] = result[i] < result[j] + 1 ? result[j] + 1 : result[i];
				}
			}
			if (result[i] > max) {
				max = result[i];
			}
		}
        return max;
    }

}
