package leetcode.ex118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<> (numRows);
		if (numRows <= 0) {
			return list;
		}
		ArrayList<Integer> temp = new ArrayList<>(1); 
		temp.add(1);
		list.add(temp);
        for (int i = 1; i < numRows; i++) {
        	temp = new ArrayList<>(i + 1); 
        	temp.add(1);
			for (int j = 1; j < i; j++) {
				temp.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
			}
			temp.add(1);
			list.add(temp);
		}
        return list;
    }
}
