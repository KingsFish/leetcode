package leetcode.ex26;

public class Solution {
	public static void main(String[] args) {
		int [] nums = new int[]{};
		removeDuplicates(nums);
	}
	
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
        int now_head = 0;
        int i = 0;
        while (i < nums.length) {
        	if (nums[i] != nums[now_head]) {
        		if (i - now_head > 1) {
        			nums[now_head + 1] = nums[i];
				}
				now_head ++;
			}
        	i ++;
		}
        
        for (int temp = 0; temp < nums.length; temp++) {
			System.out.print(nums[temp] + ",");
		}
        System.out.println("\nlength:" + (now_head + 1));
        return now_head + 1;
    }
}
