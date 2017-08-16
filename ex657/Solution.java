public class Solution {
    public boolean judgeCircle(String moves) {
        int verti = 0, hori = 0;
        for (char c : moves.toCharArray()){
            switch(c){
                case 'U':
                    hori ++;
                    break;
                case 'D':
                    hori --;
                    break;
                case 'L':
                    verti --;
                    break;
                case 'R':
                    verti ++;
                    break;
            }
        }
        return verti == 0 && hori == 0;
    }
}