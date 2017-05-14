package leetcode.ex575;

import java.util.HashSet;

public class Solution {

	public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < candies.length; i++) {
			if (set.add(candies[i])) {
				count ++;
			}
		}
        return count > candies.length / 2 ? candies.length / 2 : count;
    }
}
