package leetcode.ex38;

public class Solution {
	
	public String countAndSay(int n) {
		StringBuilder sb = new StringBuilder("1");
		for (int i = 1; i < n; i++) {
			char [] cs = sb.toString().toCharArray();
			sb.delete(0, sb.length());
			int times = 1;
			char number = cs[0];
			for (int j = 1; j < cs.length; j++) {
				if (cs[j] == number) {
					times ++;
				} else {
					sb.append(times + "" + number);
					times = 1;
					number = cs[j];
				}
			}
			sb.append(times + "" + number);
		}
        return sb.toString();
    }
}
