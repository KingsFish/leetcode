package leetcode.ex200;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        boolean [][] search = new boolean[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j ++) {
                if (grid[i][j] == '1' && !search[i][j]) {
                    res ++;
                    dfs(i, j, grid, search);
                }
            }
        }
        return res;
    }
    
    private void dfs(int i, int j, char [][] grid, boolean [][] search){
        if (i >= 0 && i < grid.length && j >=0 && j < grid[i].length) {
            if (grid[i][j] == '1' && !search[i][j]) {
                search[i][j] = true;
                dfs(i - 1, j, grid, search);
                dfs(i, j - 1, grid, search);
                dfs(i + 1, j, grid, search);
                dfs(i, j + 1, grid, search);
            }
        }
    }
}