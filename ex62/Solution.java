package leetcode.ex62;

public class Solution {

	public int uniquePaths(int m, int n) {
        int [][] number = new int [m][n];

        for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (i == 0 || j == 0) {
					number[i][j] = 1;
				} else {
					number[i][j] = number[i - 1][j] + number[i][j - 1];
				}
			}
		}
        return number[m - 1][n - 1];
    }
}
