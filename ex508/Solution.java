package leetcode.ex508;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Solution {
	
	int maxCount = 0;
	
	public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        getsum(root, map);
        for (int num : map.keySet()) {
			if (map.get(num) == maxCount) {
				list.add(num);
			}
		}
        int [] result = new int [list.size()];
        for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
        return result;
    }
	
	private int getsum(TreeNode root, HashMap<Integer, Integer> map){
		if (root == null) {
			return 0;
		}
		int sum = getsum(root.left, map) + getsum(root.right, map) + root.val;
		int count = map.get(sum) == null ? 1 : map.get(sum) + 1;
		map.put(sum, count);
		maxCount = Math.max(count, maxCount);
		return sum;
	}
}
