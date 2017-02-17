package leetcode.ex492;

public class Solution {
	public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        while (area % L != 0) {
        	L --;
		}
        return new int[]{area / L, L};
    }
}
