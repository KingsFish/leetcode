package leetcode.ex485;

public class Solution {

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				temp ++;
				if (max < temp) {
					max = temp;
				}
			} else {
				temp = 0;
			}
		}
        return max;
    }
}
