package leetcode.ex486;

public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int [n];
        for (int s = n; s >= 0; s --){
            for (int e = s + 1; e < n; e ++){
                dp[e] = Math.max(nums[s] - dp[e], nums[e] - dp[e - 1]);
            }
        }
        return dp[n - 1] >= 0;
    }
    
}