package leetcode.ex540;

public class Solution {

	public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int mid = 0;
        while(lo < hi) {
        	mid = lo + (hi - lo) / 2;
        	if (mid % 2 == 1) {
				mid --;
			}
        	if (nums[mid] != nums[mid + 1]) {
        		hi = mid;
			} else {
				lo = mid + 2;
			}
        
        }
        return nums[lo];
    }
}
