package leetcode.ex35;

public class Solution {

	public int searchInsert(int[] nums, int target) {
		int lo = 0, hi = nums.length;
		int mid = 0;
        while (lo < hi) {
        	mid = (lo + hi) / 2;
        	if (target < nums[mid]) {
				hi = mid;
			} else if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
        return hi;
    }
}
