package leetcode.ex59;

public class Solution {
	public int[][] generateMatrix(int n) {
        int [][] result = new int [n][n];
        int index = 0, length = n;
        int begin = 1;
        while (index < n / 2) {
        	begin = getCircle(index, index, result, length, begin);
        	length -= 2;
        	index++;
		}
        if (n % 2 == 1) {
			result[n / 2][n / 2] = n * n;;
		}
        return result;
    }
	
	private int getCircle(int i, int j, int [][] result, int length, int begin){
		int temp_i = i, temp_j = j;
		while (j < temp_j + length) {
			result[i][j++] = begin++;
		}
		i++; j--;
		while (i < temp_i + length) {
			result[i++][j] = begin++; 
		}
		j--;i--;
		while (j >= temp_j) {
			result[i][j--] = begin++; 
		}
		i --;j++;
		while (i > temp_i) {
			result[i--][j] = begin++; 
		}
		return begin;
	}
}
