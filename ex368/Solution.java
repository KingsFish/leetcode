package leetcode.ex368;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        int max = 1, max_index = 0;
        int [] dp = new int[nums.length];
        int [] index = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(index, -1);
        for (int i = 0; i < nums.length;i ++){
            for (int j = i - 1; j >= 0; j--){
                if (nums[i] % nums[j] == 0 && dp[i] < 1 + dp[j]){
                    dp[i] = dp[j] + 1;
                    index[i] = j;
                }
            }
            if(max < dp[i]) {
                max = dp[i];
                max_index = i;
            }
        }
        while(max_index != -1){
            result.add(nums[max_index]);
            max_index = index[max_index];
        }
        return result;
    }
}