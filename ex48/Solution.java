package leetcode.ex48;

public class Solution {

	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int i = 0;
		int temp = 0;
		while (i < n / 2) {
			for (int j = i; j < n - i - 1; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
			i++;
		}
	}
}
