package leetcode.ex81;

public class Solution {
    public boolean search(int[] nums, int target) {
		if (nums.length == 0) return false;
		int lo = 0, hi = nums.length - 1;
		while(lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] == target) {
				return true;
			}
			if (nums[mid] > nums[hi]){
				if (target < nums[mid] && nums[lo] <= target) hi = mid;
				else lo = mid + 1;
			} else if (nums[mid] < nums[hi]) {
				if (target > nums[mid] && target <= nums[hi]) lo = mid + 1;
				else hi = mid;
			} else {
				hi --;
			}
		}
		return nums[lo] == target;
	}
}