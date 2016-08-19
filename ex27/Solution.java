package leetcode.ex27;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] nums = new int[]{1,2,3,4};
		System.out.println("length:" + solution.removeElement(nums, 2));
	}

	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			if (nums[0] == val) {
				return 0;
			} else {
				return 1;
			}
		}
		int size = 0;
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
		for (; size < nums.length; size++) {
			if (nums[size] == val) {
				break;
			}
		}
		for (int i : nums) {
			System.out.print(i + ",");
		}
		return size;
    }
}
