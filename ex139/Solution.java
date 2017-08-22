package leetcode.ex139;

import java.util.List;

public class Solution {

	public boolean wordBreak(String s, List<String> wordDict) {
		int width = s.length();
        boolean [] dp = new boolean [width + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++){
            for (int j = 0; j < wordDict.size(); j ++){
                String tmp = wordDict.get(j);
                if (tmp.length() <= i){
                	if (dp[i - tmp.length()]) {
                		String tmp_s = s.substring(i - tmp.length(), i);
                		if (tmp.equals(tmp_s)){
                			dp[i] = true;
                		}
					}
                }
            }    
        }
        return dp[width];
    }
}
