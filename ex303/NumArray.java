package leetcode.ex303;

public class NumArray {
	private int [] nums;
    public NumArray(int[] nums) {
        if (nums.length <= 0) {
			return;
		}
        for (int i = 1; i < nums.length; i++) {
        	nums[i] = nums[i - 1] + nums[i]; 
		}
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        return i == 0 ? nums[j] : nums[j] - nums[i - 1];
    }
}
