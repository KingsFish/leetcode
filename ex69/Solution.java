package leetcode.ex69;

public class Solution {

	public int mySqrt(int x) {
        long lo = 0, hi = x;
        while (lo < hi) {
        	long mid = (lo + hi) / 2;
        	if (mid * mid > x) {
        		hi = mid - 1;
			} else {
				if ((mid + 1) * (mid + 1) > x) {
					return (int)mid;
				} else {
					lo = mid + 1;
				}
			}
		}
        return (int)lo;
    }
}
