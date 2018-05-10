package leetcode.ex695;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean [][] search = new boolean[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j ++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, grid, search, 0));
                }
            }
        }
        return res;
    }
    
    private int dfs(int i, int j, int [][] grid, boolean [][] search, int size){
        if (i >= 0 && i < grid.length && j >=0 && j < grid[i].length) {
            if (grid[i][j] == 1 && !search[i][j]) {
                size ++;
                search[i][j] = true;
                size = dfs(i - 1, j, grid, search, size);
                size = dfs(i, j - 1, grid, search, size);
                size = dfs(i + 1, j, grid, search, size);
                size = dfs(i, j + 1, grid, search, size);
            }
        }
        return size;
        
    }
}