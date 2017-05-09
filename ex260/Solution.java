package leetcode.ex260;

public class Solution {
	public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int [] result = new int [2];
        boolean first = false;
        for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i])) {
				set.remove(nums[i]);
			}
		}
        for (int i : set) {
        	if (first) {
        		result[1] = i;
			} else {
				result[0] = i;
				first = true;
			}
		}
        return result;
    }
	
	public int[] singleNumber_v2(int[] nums) {
		int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;
        
        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
}
