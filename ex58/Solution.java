package leetcode.ex58;

public class Solution {
	public int lengthOfLastWord(String s) {
        s = s.trim();
        char [] temp = s.toCharArray();
        int result = 0;
        for (int i = temp.length - 1; i >= 0; i--) {
			if (temp[i] == ' ') {
				break;
			}
			result ++;
		}
        return result;
    }
}
