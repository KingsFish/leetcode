package leetcode.ex168;

public class Solution {

	public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int tmp = n;
        while (tmp != 0) {
        	tmp --;
        	sb.append((char)(tmp % 26 + 65));
        	tmp /= 26;
		}
        return sb.reverse().toString();
    }
}
