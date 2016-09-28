package leetcode.ex75;

public class Solution {

	public static void main(String[] args) {
		int [] nums = new int []{1,2,0};
		sortColorsV2(nums);
	}
	
	public static void sortColorsV2(int [] nums){
		int low = 0, high = nums.length - 1;
		for (int i = 0; i <= high;) {
			if (nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[low];
				nums[low] = temp;
				low ++;
				i ++;
			} else if (nums[i] == 2) {
				int temp = nums[i];
				nums[i] = nums[high];
				nums[high] = temp;
				high --;
			} else {
				i ++;
			}
		}
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}
	
	public void sortColors(int[] nums) {
        int red = 0, white = 0;
        for (int i = 0; i < nums.length; i++) {
			
		}
        for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
			case 0:
				red ++;
				break;
			case 1:
				white ++;
				break;
			}
		}
        for (int i = 0; i < nums.length; i++) {
			if (i < red) {
				nums[i] = 0;
			} else if (i < red + white) {
				nums[i] = 1;
			} else {
				nums[i] = 2;
			}
		}
    }
}
