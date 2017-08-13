public class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] sub = s.toCharArray();
        char [] strs = t.toCharArray();
        int i = 0, j = 0;
        while (i < sub.length && j < strs.length){
            if (sub[i] == strs[j]){
                i ++;
            }
            j ++;
        }
        if (i == sub.length){
            return true;
        } else {
            return false;
        }
    }
}