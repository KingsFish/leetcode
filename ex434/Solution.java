package leetcode.ex434;

public class Solution {
	public int countSegments(String s) {
		int count = 0, lo = 0;
		while (lo < s.length()) {
			if (s.charAt(lo) != ' ') {
				count ++;
				while (lo < s.length() && s.charAt(lo) != ' ') {
					lo ++;
				}
			} else {
				while (lo < s.length() && s.charAt(lo) == ' ') {
					lo ++;
				}
			}
			
		}
		return count;
	}
}
