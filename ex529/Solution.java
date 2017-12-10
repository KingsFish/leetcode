package leetcode.ex529;

public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        char c = board[click[0]][click[1]];
        if (c == 'M'){
            board[click[0]][click[1]] = 'X';
        } else {
            int result = getMinerNumber(click, board);
            if(result == 0){
                for (int i = -1; i < 2; i ++){
                    for (int j = -1; j < 2; j++){
                        int r = click[0] + i, k = click[1] + j;
                        if (i == 0 && j == 0){
                            board[r][k] = 'B';
                        } else if (!inRange(r, board.length) || !inRange(k, board[0].length)){
                            continue;
                        } else {
                            if(board[r][k] == 'E'){
                        		updateBoard(board, new int []{r, k}); 
                        	}
                        }
                    }
                }
            } else {
                board[click[0]][click[1]] = (char)(result + '0');
            }
        }
        return board;
        
    }
    
    private int getMinerNumber(int [] cls, char [][] board){
        int height = board.length, width = board[0].length;
        int result = 0;
        for (int tmp_i = cls[0] - 1 ; tmp_i <= cls[0] + 1; tmp_i ++){
            for (int tmp_j = cls[1] -1 ; tmp_j <= cls[1] + 1; tmp_j ++){
                if (inRange(tmp_i, height) && inRange(tmp_j, width) && board[tmp_i][tmp_j] == 'M')
                    result ++;
            }
        }
        return result;
    }
    
    private boolean inRange(int i, int length){
        return i >= 0 && i < length;
    }
}