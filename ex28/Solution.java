package leetcode.ex28;

public class Solution {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
        char [] original = haystack.toCharArray();
        char [] target = needle.toCharArray();
        int i, j;
        for (i = 0; i < original.length - target.length + 1;) {
			for (j = target.length - 1; j >= 0; j--) {
				if (target[j] != original[i + j]) {
					break;
				} else if (j == 0) {
					return i;
				}
			}
		}
        return -1;
    }
}
