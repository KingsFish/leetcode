package leetcode.ex169;

import java.util.Arrays;

public class Solution {

	public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i ++){
            if (count == 0){
                count ++;
                major = nums[i];
            } else if (nums[i] != major){
                count --;
            } else {
                count ++;
            }
        }
        return major;
    }
	
	public int majorityElement_v1(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
