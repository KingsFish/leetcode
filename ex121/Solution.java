package leetcode.ex121;

public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}
		int [] max = new int [prices.length];
		int result = 0;
		max[prices.length - 1] = prices[prices.length - 1];
		for (int i = prices.length - 2; i >= 0; i--) {
			max[i] = max[i + 1] > prices[i] ? max[i + 1] : prices[i];
		}
		for (int i = 0; i < max.length; i++) {
			max[i] = max[i] - prices[i];
			result = result > max[i] ? result : max[i];
		}
		return result;
    }
}
