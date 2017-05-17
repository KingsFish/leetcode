package leetcode.ex566;

public class Solution {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
			return nums;
		}
        int hei = nums.length, wid = nums[0].length;
        int [][] result = new int [r][c];
        for (int i = 0; i < hei; i++) {
			for (int j = 0; j < wid; j++) {
				int sum = i * wid + 1 + j;
				int k1 = (sum - 1) / c;
				int k2 = sum - 1 - c * k1;
				result[k1][k2] = nums[i][j];
			}
		}
        return result;
    }
}
