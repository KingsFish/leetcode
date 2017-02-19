package leetcode.ex268;

public class Solution {
	public int missingNumber(int[] nums) {
		int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}

		return xor ^ i;	
		
//		int [] temp = new int [nums.length + 1];
//		for (int i = 0; i < nums.length; i++) {
//			temp[nums[i]] = 1;
//		}
//		for (int i = 0; i < temp.length; i++) {
//			if (temp[i] == 0) {
//				return i;
//			}
//		}
//		return nums.length;
    }
}
