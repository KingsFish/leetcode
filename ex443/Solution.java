package leetcode.ex443;

public class Solution {
    public int compress(char[] chars) {

        int posi = 0, c = 0;
        for (int i = 1; i <= chars.length; i ++){
            if (i == chars.length || chars[i] != chars[c]){
                chars[posi] = chars[c];
                if (i - c > 1){
                    String tmp = i - c + "";
                    int j = 0;
                    while (j < tmp.length()){
                        chars[j + posi + 1] = tmp.charAt(j);
                        j++;
                    }
                    posi += j + 1;
                } else {
                    posi ++;
                }
                c = i;
            }
        }
        return posi == 0 ? 1 : posi;
    }
}