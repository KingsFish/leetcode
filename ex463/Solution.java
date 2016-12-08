package leetcode.ex463;

public class Solution {

	
	public int islandPerimeter(int[][] grid) {
		int land = 0;
		int lap = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					land ++;
					lap += checkGrid(grid, i, j);
				}
			}
		}
		return 4 * land - lap;
    }
	
	private int checkGrid(int [][] grid, int i, int j){
		int lap = 0;
		if (isExist(grid, i, j - 1)) {
			lap += grid[i][j - 1] == 1 ? 1 : 0;
		}
		if (isExist(grid, i + 1, j)) {
			lap += grid[i + 1][j] == 1 ? 1 : 0;
		}
		if (isExist(grid, i, j + 1)) {
			lap += grid[i][j + 1] == 1 ? 1 : 0;
		}
		if (isExist(grid, i - 1, j)) {
			lap += grid[i - 1][j] == 1 ? 1 : 0;
		}
		return lap;
		
	}
	private boolean isExist(int [][] grid, int i, int j){
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
			return true;
		}
		return false;
		
	}
}
