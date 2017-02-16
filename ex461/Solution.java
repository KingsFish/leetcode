package leetcode.ex461;

public class Solution {

	public int hammingDistance(int x, int y) {
		int temp = x ^ y;
		int result = 0;
		while (temp != 0) {
			if ((temp & 1) != 0) {
				result ++;
			}
			temp >>= 1;
		}
        return result;
    }
}
