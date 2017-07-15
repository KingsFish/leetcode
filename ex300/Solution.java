package leetcode.ex300;

import java.util.Arrays;

public class Solution {

	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
        int [] result = new int [nums.length];
        Arrays.fill(result, 1);
        int max = 1;
        for (int i = 1; i < result.length; i++) {
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
