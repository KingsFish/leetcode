package leetcode.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum_v1(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp;
		int lastIndex_i = -1, lastIndex_j = -1;
		for (int i = 0; i < nums.length - 2;) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int position = binarySearch(nums, - (nums[i] + nums[j]), j + 1, nums.length);
				if (position != -1) {
					if (!(lastIndex_i != -1 && nums[i] == nums[lastIndex_i] && nums[j] == nums[lastIndex_j])) {
						temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[position]);             
						result.add(temp);
						lastIndex_i = i;
						lastIndex_j = j;
					}
				}
			}
			i++;
			while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
				i++;
			}
		}
		return result;
    }
	
	private int binarySearch(int [] nums, int target, int lo, int hi){
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] > target) {
				hi = mid;
			} else if (nums[mid] < target) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
}
