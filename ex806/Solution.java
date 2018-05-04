package leetcode.ex806;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int [] res = new int[]{0, 0};
        for (char c : S.toCharArray()) {
            if (res[0] == 0) {
                res[0] ++;
            }
            int pos = c - 'a';
            if (res[1] + widths[pos] > 100) {
                res[0] ++;
                res[1] = widths[pos];
            } else {
                res[1] += widths[pos];
            }
        }
        return res;
    }
}