package leetcode.ex91;

public class Solution {
    public int numDecodings(String s) {
        int fir = 0, sec = 0;
        char [] c = s.toCharArray();
        for (int i = 0; i < c.length; i ++){
            if (i >= 2){
                if (c[i] == '0'){
                    if (Integer.valueOf("" + c[i - 1] + c[i]) < 27){
                        fir = sec;
                        sec = 0;
                    } else {
                        return 0;
                    }             
                } else {
                    if (Integer.valueOf("" + c[i - 1] + c[i]) < 27){
                        fir += sec;
                        sec = fir - sec;
                    } else {
                        sec = fir;
                    }
                }
                
            } else if (i == 1){
                if (c[i] == '0'){
                    if (c[i - 1] < '3'){
                        fir = 1;
                        sec = 0;
                    } else {
                        return 0;
                    }
                } else {
                    if (Integer.valueOf("" + c[i - 1] + c[i]) < 27){
                        sec = fir;
                        fir = 2;
                    } else {
                        sec = fir;
                    }
                }
                
            } else {
                if (c[0] == '0'){
                    return 0;
                } else {
                    fir = 1;
                }               
            }
        }
        return fir;
    }
}