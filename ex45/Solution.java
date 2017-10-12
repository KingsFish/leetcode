package leetcode.ex45;

public class Solution{
    public int jump(int[] nums) {
        int e = 0;
        int max = 0;
        int rs = 0;
        for (int i = 0; i < nums.length - 1; i ++){
            max = Math.max(max, i + nums[i]);
            if (i == e){
                rs ++;
                e = max;
            }
        }       
        return rs;
    }
}