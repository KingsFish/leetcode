package leetcode.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum_v1(int[] nums) {
		List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length > 0 && nums[nums.length - 1] < 0) return lists;
        for (int i = 0; i < nums.length - 2; i++) {
        	
        	// if nums[i] > 0, we can never get sum to 0
            if (nums[i] > 0) break;
            
            //avoid duplicate triplets
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            
            int target = -nums[i];
            int l = i + 1, r = nums.length - 1;
            // both side
            while (l < r) {
            	// target is negative
                if (nums[l] + nums[r] > target) {
                	// right side is too huge
                    r--;
                } else if (nums[l] + nums[r] < target) {
                	// left side is too small
                    l++;
                } else {
                    lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // avoid duplicate 
                    while (++l < r && nums[l] == nums[l - 1]) ;
                    while (--r > l && nums[r] == nums[r + 1]) ;
                }
            }
        }
        return lists;
	}
	
	public List<List<Integer>> threeSum_v2(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp;
		int lastIndex_i = -1, lastIndex_j = -1;
		for (int i = 0; i < nums.length - 2;) {
			for (int j = i + 1; j < nums.length - 1; j++) {
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
