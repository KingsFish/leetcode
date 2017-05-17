package leetcode.ex561;

import java.util.Arrays;

public class Solution {

	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
			sum += i % 2 == 0 ? nums[i] : 0;
		}
        return sum;
    }
}
