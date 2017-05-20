package leetcode.ex551;

public class Solution {
	
	public boolean checkRecord(String s) {
		int a = 0, l = 0;
		for (char c : s.toCharArray()) {
			switch (c) {
			case 'A':
				if (a >= 1) {
					return false;
				}
				a ++;
				l = 0;
				continue;
			case 'L':
				l ++;
				if (l > 2) {
					return false;
				}
				continue;
			default:
				l = 0;
				continue;
			}
		}
		return true;
    }

}
