package leetcode.ex398;

import java.util.HashMap;

public class Solution {

    HashMap<Integer, String> set = new HashMap<>();
    int [] num;
    Random rnd;
    public Solution(int[] nums) {
        //553ms
        for (int i = 0; i < nums.length; i ++){
            if (set.containsKey(nums[i])){
                set.put(nums[i], set.get(nums[i]) + "," + i);
            } else {
                set.put(nums[i], "" + i);
            }
        }
    }
    
    public int pick(int target) {
        String str = set.get(target);
        String[] strs = str.split(",");
        int random = (int)(Math.random() * strs.length);
        return Integer.valueOf(strs[random]);
    }
    
    public Solution_v2(int[] nums) {
        //361ms 蓄水池抽样算法
        this.nums = nums;
        this.rnd = new Random();
    }
    
    public int pick_v2(int target) {
        int result = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            if (rnd.nextInt(++count) == 0)
                // 此处==号右边可以为任意数字，但是保险起见使用0，因为0必然会出现
                result = i;
        }
        
        return result;
    }
}