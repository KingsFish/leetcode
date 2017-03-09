package leetcode.ex137;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
        	if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], 2);
			}
		}
        for (int i : map.keySet()) {
			if (map.get(i) == 1) {
				return i;
			}
		}
        return -1;
    }
	
	public int singleNumber_v2(int [] nums){
		int ones = 0, twos = 0;
        for(int i = 0; i < nums.length; i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;

	}
}
