package leetcode.ex494;

public class Solution {
	public int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }
        if (S > sum || (S + sum) % 2 != 0){
            return 0;
        }
        sum = (S + sum) / 2;
        int [] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i ++){
            for (int j = sum; j >= nums[i]; j --){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[sum];
    }
}
