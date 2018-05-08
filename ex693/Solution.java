package leetcode.ex693;

class Solution {
    public boolean hasAlternatingBits(int n) {
        char [] chars = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < chars.length - 1; i ++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}