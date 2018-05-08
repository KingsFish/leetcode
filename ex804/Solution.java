package leetcode.ex804;

import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] chars = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int res = 0;
        HashSet<String> set = new HashSet<>();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()){
                sb.append(chars[c - 'a']);
            }
            if(set.add(sb.toString())) {
                res ++;
            }
        }
        return res;
    }
}