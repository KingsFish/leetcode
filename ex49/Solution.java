package leetcode.ex49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, Integer> map = new HashMap<>();
		int index = 0;
		for (int i = 0; i < strs.length; i++) {
			char [] temp = strs[i].toCharArray();
			Arrays.sort(temp);
			if (map.containsKey(String.valueOf(temp))) {
				result.get(map.get(String.valueOf(temp))).add(strs[i]);
			} else {
				List<String> list = new ArrayList<>();
				list.add(strs[i]);
				result.add(list);
				map.put(String.valueOf(temp), index);
				index ++;
			}
		}
		return result;
    }
}
