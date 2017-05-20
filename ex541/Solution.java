package leetcode.ex541;

public class Solution {

	public String reverseStr(String s, int k) {
		if (s.length() == 0 || k == 0 || k == 1) {
			return s;
		}
		char [] cs = s.toCharArray();
		int start = 0;
		while (start < s.length()) {
			int end = 0;
			if (start + k < s.length()) {
				end = start + k - 1;
			} else {
				end = s.length() - 1;
			}
			reverse(cs, start, end);
			start += 2 * k;
		}
		return String.valueOf(cs);
    }
	
	private void reverse(char [] cs, int lo, int hi){
		while (lo < hi) {
			char c = cs[lo];
			cs[lo++] = cs[hi];
			cs[hi--] = c;
		}
	}
}
