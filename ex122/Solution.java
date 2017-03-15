package leetcode.ex122;

public class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0, temp = 0;
        for (int i = 1; i < prices.length; i++) {
        	temp = prices[i] - prices[i - 1];
        	profit += temp > 0 ? temp : 0;
		}
        return profit;
    }
}
