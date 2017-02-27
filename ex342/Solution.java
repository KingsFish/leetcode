package leetcode.ex342;

public class Solution {

	public boolean isPowerOfFour(int num) {
		while (num % 4 == 0 && num != 0) {
			num /= 4;
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
    }
}
