package leetcode.ex474;

public class Solution {

	//time O(lmn), space O(mn)
	
	public int findMaxForm_v1(String[] strs, int m, int n){
		int l = strs.length;
        int [][] dp = new int[m + 1][n + 1];     
        for (int i = 0; i < l; i ++){
            int [] nums = getNum(strs[i]);
            for (int j = m; j >= nums[0]; j --){
                for (int k = n; k >= nums[1]; k --){
                    dp[j][k] = Math.max(dp[j][k], dp[j - nums[0]][k - nums[1]] + 1);
                    
                }
            }
        }
        return dp[m][n];
	}
	
	
	// time O(lmn), space O(lmn)
	public int findMaxForm(String[] strs, int m, int n) {
        int l = strs.length;
        int [][][] d = new int[l + 1][m + 1][n + 1];     
        for (int i = 0; i <= l; i ++){
            int [] nums = new int[]{0,0};
            if (i > 0){
               nums = getNum(strs[i - 1]);
            }         
            for (int j = 0; j <= m; j ++){
                for (int k = 0; k <= n; k ++){
                    if (i == 0) {
                        d[i][j][k] = 0;
                    } else if (j >= nums[0] && k >= nums[1]){
                        d[i][j][k] = Math.max(d[i - 1][j][k], d[i - 1][j - nums[0]][k - nums[1]] + 1);
                    } else {
                        d[i][j][k] = d[i - 1][j][k];
                    }     
                    
                }
            }           
        }
        return d[l][m][n];
    }
    
    private int [] getNum(String str){
        int [] nums = new int [2];
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '0') {
                nums[0] ++;
            } else {
                nums[1] ++;
            }
        }
        return nums;
    }
}
