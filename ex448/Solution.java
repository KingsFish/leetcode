package leetcode.ex448;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
        int [] bits = new int[nums.length + 1];       
        for (int i = 0; i < nums.length; i++) {
			bits[nums[i]] = 1;
		}
        
        for (int i = 1; i < bits.length; i++) {
			if (bits[i] == 0) {
				result.add(i);
			}
		}
        return result;
    }
}
