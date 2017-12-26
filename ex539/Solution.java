package leetcode.ex539;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int result = 12 * 60 + 1;
        int [] time = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i ++){
            time[i] = getMinutes(timePoints.get(i));
        }
        Arrays.sort(time);
        for (int i = 1; i < time.length; i++){
            result = Math.min(result, time[i] - time[i - 1]);
        }
        result = Math.min(result, 24 * 60 - time[time.length - 1] + time[0]);
        return result;
    }
    
    private int getMinutes(String str){
        String [] times = str.split(":");
        int result = 0;
        result += Integer.valueOf(times[1]);
        result += Integer.valueOf(times[0]) * 60;
        return result;
    }
}