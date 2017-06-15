package leetcode.ex364;

public class Solution {

	public boolean isPerfectSquare(int num) {
        long lo = 1, hi = num / 2;
        while (lo < hi) {
        	long mid = lo + (hi - lo) / 2;
        	if (mid * mid < num) {
        		lo = mid + 1;
			} else if (mid * mid > num) {
				hi = mid;
			} else {
				return true;
			}
		}
        return lo * lo == num;
    }
}
