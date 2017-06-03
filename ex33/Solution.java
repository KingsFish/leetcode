package leetcode.ex33;

public class Solution {

	public int search(int[] nums, int target) {
		if (nums.length == 0) {
			return -1;
		}
		int lo = 0, hi = nums.length - 1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (nums[lo] <= nums[mid]) {
				if (target >= nums[lo] && target < nums[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return nums[lo] == target ? lo : -1;
    }
}