package leetcode.ex554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public int leastBricks(List<List<Integer>> wall) {
		if (wall.size() == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (List<Integer> list : wall) {
			int length = 0;
			for (int i = 0; i < list.size() - 1; i++) {
				length += list.get(i);
				int times;
				if (map.containsKey(length)) {
					times = map.get(length) + 1;
				} else {
					times = 1;
				}
				map.put(length, times);
				max = max < times ? times : max;
			}
		}
		return wall.size() - max;
	}
}
