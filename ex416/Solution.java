package leetcode.ex416;

public class Solution {

	public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }
        if (sum % 2 != 0){
            return false;
        }
        int [] dp = new int [sum / 2 + 1];
        for (int i = 0; i < nums.length; i++){
            for (int j = sum / 2; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[sum / 2] == sum / 2;
    }
}
