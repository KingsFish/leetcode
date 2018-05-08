package leetcode.ex824;

class Solution {
    public String toGoatLatin(String S) {
        if (S.equals("")) {
            return "";
        }
        String [] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder aa = new StringBuilder();
        for (int i = 0; i < words.length; i ++) {
            aa.append('a');
            char c= words[i].charAt(0);
            if (!isVowel(c)) {
                // not vowel
                sb.append(words[i].substring(1, words[i].length()));
                sb.append(c);
            } else {
                sb.append(words[i]);
            }
            sb.append("ma");
            sb.append(aa.toString());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    private boolean isVowel(char c){
        if (c - 'Z' <= 0) {
            c = (char)(c + ('a' - 'A'));
        }
        if (c == 'a' 
            || c == 'e' 
            || c == 'i'
            || c == 'o' 
            || c == 'u') {
            return true;
        }
        return false;
    }
}