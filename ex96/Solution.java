package leetcode.ex96;

class Solution {
    public int numTrees(int n) {
        // 确定一个值i作为中点，其他作为左子树[0, i - 1]和右子树[i + 1, n]
        // [i + 1, n]也即相当于[0, n - i]
        int [] dp = new int [n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i ++){
            for (int j = 0; j <= i - 1; j ++){
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        return dp[n];
    }
}