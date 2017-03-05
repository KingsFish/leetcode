package leetcode.ex189;

public class Solution {

	public void rotate(int[] nums, int k) {
		if (nums.length == 0 || k == 0) {
			return;
		}
		k = k % nums.length;
        int [] temp = new int[k];
        for (int i = nums.length - k; i < nums.length; i++) {
			temp[i + k - nums.length] = nums[i];
		}
        for (int i = nums.length - k - 1; i >= 0; i--) {
			nums[i + k] = nums[i]; 
		}
        for (int i = 0; i < k; i++) {
			nums[i] = temp[i];
		}
    }
	
	public void rotate_v2(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
}
