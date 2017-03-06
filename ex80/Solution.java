package leetcode.ex80;

public class Solution {

	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2) {
			return nums.length;
		}
		int slow = -1, fast = 1;
		int isDup = 1;
        while (fast < nums.length) {
        	if (nums[fast] == nums[slow + 1]) {
				//相等情况下
        		if (isDup < 2) {
					//出现两次以下
        			isDup ++;
				}
        		fast ++;
			} else {
				//不相等情况下
				for (int i = slow + 2; i <= slow + isDup; i++) {
					nums[i] = nums[slow + 1];
				}
				slow += isDup;
				nums[slow + 1] = nums[fast];
				isDup = 1;
				fast ++;
			}
		}
        for (int i = slow + 2; i <= slow + isDup; i++) {
			nums[i] = nums[slow + 1];
		}
        slow += isDup;
        return slow + 1;
	}
	
	public int removeDuplicates_v2(int[] nums) {
		int i = 0;
		for (int n : nums)
			if (i < 2 || n > nums[i-2])
				nums[i++] = n;
		return i;
	}
}
