package leetcode.ex1;

import java.util.HashMap;

public class Ex1 {
	
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		int [] nums = new int[]{3,2,4};
		int [] result = e.twoSum(nums, 6);
		for (int i : result) {
			System.out.print(i + ",");
		}
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        	map.put(nums[i], i);
		}
        for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) != null && i != map.get(target - nums[i])) {
				return new int []{i, map.get(target - nums[i])};
			}
		}
        return new int []{-1, -1};
    }
}
