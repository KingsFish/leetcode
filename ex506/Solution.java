package leetcode.ex506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        String [] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	switch (nums.length - i) {
			case 1:
				str[i] = "Gold Medal";
				break;
			case 2:
				str[i] = "Silver Medal";
				break;
			case 3:
				str[i] = "Bronze Medal";
				break;
			default:
				str[map.get(nums[i])] = (nums.length - i) + "";
				break;
			}
		}
        return str;
    }
}
