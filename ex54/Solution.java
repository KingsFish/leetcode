package leetcode.ex54;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if (matrix.length == 0) {
			return list;
		}
		int colstart = 0;
		int colend = matrix.length - 1;
		int rowstart = 0;
		int rowend = matrix[0].length - 1;
		while (colstart <= colend && rowstart <= rowend) {
			for (int i = rowstart; i <= rowend; i++) {
				list.add(matrix[colstart][i]);
			}
			colstart ++;
			for (int i = colstart; i <= colend; i++) {
				list.add(matrix[i][rowend]);
			}
			rowend--;
			for (int i = rowend; i >= rowstart && colstart <= colend; i--) {
				list.add(matrix[colend][i]);
			}
			colend--;
			for (int i = colend; i >= colstart && rowstart <= rowend; i--) {
				list.add(matrix[i][rowstart]);
			}
			rowstart++;
		}
		return list;
	}
}
