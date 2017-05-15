package leetcode.ex3;

import java.util.HashMap;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
        char [] temp = s.toCharArray();
        int result = 0, last = 0, max = 0;
        for (int i = 0; i < temp.length;) {
        	if (map.containsKey(temp[i])) {
        		//出现过
        		max = i - last;
        		if (result < max) {
					result = max;
				}
        		if (last < map.get(temp[i]) + 1) {
					last = map.get(temp[i]) + 1;
				}
        	}
        	map.put(temp[i], i);
        	i ++;
		}
        return result > s.length() - last ? result : s.length() - last;
    }
	public int lengthOfLongestSubstring_v2(String s) {
		if (s.length()==0) return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max=0;
		for (int i=0, j=0; i<s.length(); ++i){
			if (map.containsKey(s.charAt(i))){
				j = Math.max(j,map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i),i);
			max = Math.max(max,i-j+1);
		}
		return max;
	}
	
	
}
