package leetcode.ex119;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>(1);
		List<Integer> temp;
		if (rowIndex == 0) {
			list.add(1);
		}
        for (int i = 1; i < rowIndex + 1; i++) {
        	temp = list;
        	list = new ArrayList<>(i + 1);
        	list.add(1);
        	for (int j = 1; j < temp.size(); j++) {
				list.add(temp.get(j) + temp.get(j - 1));
			}
        	list.add(1);
        }
        return list;
    }
}
