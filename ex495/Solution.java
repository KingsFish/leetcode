package leetcode.ex495;

public class Solution {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if (timeSeries.length == 0) {
			return 0;
		}
		int sum = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
			if (timeSeries[i] + duration > timeSeries[i + 1]) {
				sum += timeSeries[i + 1] - timeSeries[i];
			} else {
				sum += duration;
			}
		}
        return sum;
    }
}
