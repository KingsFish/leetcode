package leetcode.ex151;

public class Solution {

	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
        String [] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i > 0; i--) {
        	if (!strs[i].equals("")) {
        		sb.append(strs[i] + " ");
			}
		}
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
