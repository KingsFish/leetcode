package leetcode.ex283;

public class Solution {
	
	public static void main(String[] args) {
		int [] a = new int[]{0,12,0,3,12};
		moveZeroes(a);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}
	
	public static void moveZeroes(int[] nums) {
		int val = 0;
        if (nums.length == 0 || nums.length == 1) {
			return;
		} 
		int no_val_position = 0;
		int val_position = 0;
		while (no_val_position < nums.length && val_position < nums.length) {
			while (no_val_position < nums.length) {
				if (nums[no_val_position] != val) {
					break;
				}
				no_val_position ++;
			}
			
			while (val_position < nums.length) {
				if (nums[val_position] == val) {
					break;
				}
				val_position ++;
			}
			if (val_position >= nums.length || no_val_position >= nums.length) {
				break;
			}
			if (no_val_position > val_position) {
				nums[val_position] = nums[no_val_position];
				nums[no_val_position] = val;
				val_position ++;
				no_val_position ++;
			} else {
				no_val_position ++;
			}
		}
    }
}
