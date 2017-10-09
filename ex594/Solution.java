package leetcode.ex594;

public class Solution{
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i] ,0) + 1);
            if (map.containsKey(nums[i] - 1) || map.containsKey(nums[i] + 1)){
                max = Math.max(max, map.getOrDefault(nums[i] ,0) + 
                               Math.max(map.getOrDefault(nums[i] - 1 ,0), map.getOrDefault(nums[i] + 1 ,0)));
            }
                
        }
        return max;
    }
}

