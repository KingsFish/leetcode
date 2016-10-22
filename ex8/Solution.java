package leetcode.ex8;

public class Solution {

	public static int myAtoi(String str) {
		char [] bytes = str.trim().toCharArray();
		if (bytes.length == 0) {
			return 0;
		}
		int lo = 0;
		int sign = 1;
		if (bytes[0] == '-' || bytes[0] == '+') {
			if (bytes[0] == '-') {
				sign = -1;
			}
			lo = 1;
		}
		int hi = lo;
		while (hi < bytes.length) {
			if (bytes[hi] < '0' || bytes[hi] > '9') {
				break;
			}
			hi ++;
		}
		long r = 0;
		int length = hi - lo - 1;
		while (lo < hi) {
			r += ((int) bytes[lo++] - 48) * Math.pow(10, length--);
		}
		if (r > Integer.MAX_VALUE) {
			return (bytes[0] == '-') ? Integer.MIN_VALUE: Integer.MAX_VALUE;
		}
        return (int) r * sign;
    }
}
