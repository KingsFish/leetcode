package leetcode.ex318;

public class Solution {
    public int maxProduct(String[] words) {
        int result = 0;
        int [] tmp = new int [words.length];
        for (int i = 0; i < words.length; i++){
            for(char c : words[i].toCharArray()){
                tmp[i] |= 1 << (c - 'a');
            }
        }
        for (int i = 0; i < tmp.length; i ++){
            for (int j = i + 1; j < tmp.length; j ++){
                if ((tmp[i] & tmp[j]) == 0){
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }
        return result;
    }
}