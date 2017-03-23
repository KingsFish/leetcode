package leetcode.ex73;

public class Solution {

	public void setZeroes(int[][] matrix) {
        int [] col = new int [matrix.length];
        int [] row = new int [matrix[0].length];
        for (int i = 0; i < col.length; i++) {
			for (int j = 0; j < row.length; j++) {
				if (matrix[i][j] == 0) {
					col[i] = 1;
					row[j] = 1;
				}
			}
		}
        for (int i = 0; i < col.length; i++) {
			for (int j = 0; j < row.length; j++) {
				if (col[i] == 1 || row[j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
    }
}
