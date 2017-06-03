package leetcode.ex387;

public class Solution {

	public int firstUniqChar(String s) {
		int [] chars = new int [26];
        for (char c : s.toCharArray()) {
			chars[c - 97] ++;
		}
        for (int i = 0; i < s.length(); i++) {
			if (chars[s.charAt(i) - 97] == 1) {
				return i;
			}
		}
        return -1;
    }
}
