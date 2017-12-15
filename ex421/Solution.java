package leetcode.ex421;

public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        int mask = 0;
        for(int i = 31; i >= 0; i --){
            mask |= (1 << i);
            
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(mask & num);
            }
            int tmp = max | (1 << i);
            for(int pre : set){
                if(set.contains(tmp ^ pre)){
                    max = tmp;
                    break;
                }
            }                    
        }
        return max;
    }
}