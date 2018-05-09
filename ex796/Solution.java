package leetcode.ex796;

class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        String tmp = A + A;
        if (tmp.contains(B)) {
            return true;
        } else {
            return false;
        }
    }
}