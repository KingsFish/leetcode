package leetcode.ex525;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int findMaxLength(int[] nums) {
		int sum = 0, max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] == 0 ? -1 : 1;
			if (map.containsKey(sum)) {
				max = max > i - map.get(sum) ? max : i - map.get(sum);
			} else {
				map.put(sum, i);
			}
		}
		return max;
	}
	
	public int findMaxLength_v2(int[] nums) {
	    int len = nums.length;
	    int[] map = new int[len*2+1]; 
	    int cp = len, res = 0;
	    map[cp]=1;
	    for(int i=0; i<len; i++){
	        cp+=2*nums[i]-1;
	        if(map[cp]==0) 
	            map[cp]=i+2;
	        else{
	            int ssl = i-map[cp]+2;
	            if(res < ssl)
	                res=ssl;
	        }
	    }
	    return res;
	}
}
