package leetcode.ex343;

public class Solution {
    public int integerBreak(int n) {
        int [] dp = new int[n + 2];
        dp[0] = 1;
        for (int i = 1; i <= n + 1; i ++){
            dp[i] = 1;
            for (int j = i - 1; j >= 1; j --){
                dp[i] = Math.max(dp[j] * (i - j), dp[i]);
            }
        }
        return n < 4 ? dp[n] : dp[n + 1];
    }
}