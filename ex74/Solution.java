package leetcode.ex74;

public class Solution {

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0, hi = m * n - 1;
        while (lo <= hi) {
        	int mid = lo + (hi - lo) / 2;
        	if (matrix[mid / n][mid % n] > target) {
				hi = mid - 1;
			} else if (matrix[mid / n][mid % n] < target) {
				lo = mid + 1;
			} else {
				return true;
			}
		}
        return false;
    }
}
