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
		//TODO
		int cur_zero = 0;
        int cur_nozero = 0;
        int cur = 0;
        boolean find_zero = false;
        boolean find_nozero = false;
        boolean done = false;
        while (cur < nums.length) {
        	while (!(find_nozero && find_zero)) {
        		if (cur > nums.length - 1) {
        			done = true;
        			break;
				}
        		if (nums[cur] == 0) {
					cur_zero = cur;
					find_zero = true;
					cur ++;
					continue;
				} else {
					cur_nozero = cur;
					find_nozero = true;
					cur ++;
					continue;
				}
			}
        	if (done) {
				return;
			}
        	find_nozero = false;
        	find_zero = false;
        	int temp = nums[cur_zero];
        	nums[cur_zero] = nums[cur_nozero];
        	nums[cur_nozero] = temp;
        	cur = cur_nozero;
        }
    }
}
