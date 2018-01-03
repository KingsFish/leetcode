package leetcode.ex452;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        long end = Long.MIN_VALUE;
        int count = 0;
        for (int [] p : points){
            if (p[0] > end){
                end = p[1];
                count ++;
            }
        }
        return count;
    }
}