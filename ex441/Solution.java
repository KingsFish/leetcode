package leetcode.ex441;

public class Solution {
	public int arrangeCoins(int n) {
		return (int) ((Math.sqrt(1 + 8 * (double)n) - 1) / 2);
    }
}
