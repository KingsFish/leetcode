package leetcode.ex171;

public class Solution {

	public int titleToNumber(String s) {
        char [] chars = s.toCharArray();
        int tmp = (int) Math.pow(26, s.length() - 1);
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
			int c = chars[i] - 'A' + 1;
			result += c * tmp;
			tmp /= 26;
		}
        return result;
    }
}
