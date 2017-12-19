package leetcode.ex547;

public class Solution {
    public int findCircleNum(int[][] M) {
        int [] visited = new int [M.length];
        int result = 0;
        for (int i = 0; i < M.length; i++){
            if(visited[i] == 0){
                search(M, i, visited);
                result ++;
            }
        }
        return result;
    }
    
    private void search(int [][] M, int posi, int [] visited){
        for(int i = 0; i < M.length; i++){
            if(M[posi][i] == 1 && visited[i] == 0){
                visited[i] = 1;
                search(M, i, visited);
            }
        }
    }
}