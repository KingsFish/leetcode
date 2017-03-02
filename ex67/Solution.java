package leetcode.ex67;

public class Solution {
	public String addBinary(String a, String b) {
        StringBuffer buffer = new StringBuffer();
        char [] ax = a.toCharArray();
        char [] bx = b.toCharArray();
        int i = ax.length - 1;
        int j = bx.length - 1;
        int carry = 0;
        for (; i >= 0 || j >= 0 || carry != 0; i--, j--) {
        	int x = i >= 0 ? ax[i] - 48 : 0;
        	int y = j >= 0 ? bx[j] - 48 : 0;
        	buffer.append((x + y + carry) % 2);
        	carry = (x + y + carry) / 2;
		}
        return buffer.reverse().toString();
    }
}
