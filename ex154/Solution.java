package leetcode.ex154;

import java.util.Arrays;

public class Solution {

	public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
	
	public int findMin_v2(int[] nums){
		int lo = 0, hi = nums.length - 1;
		while (lo < hi) {
			if (nums[lo] < nums[hi]) {
				return nums[lo];
			}
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] == nums[lo]) {
				lo ++;
			} else if (nums[mid] < nums[lo]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return nums[lo];
	}
}
