package leetcode.ex504;

public class Solution {
	public String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
        int i = 0, result;
        String temp = num >= 0 ? "" : "-";
        num = Math.abs(num);
        StringBuilder builder = new StringBuilder();
        while (Math.pow(7, i) <= num) {
			i++;
		}
        i--;
        while (i >= 0) {
        	result = (int)(num / Math.pow(7, i));
        	builder.append(result);
        	num -= result * Math.pow(7, i);
        	i--;
		}
        return temp + builder.toString();
    }
	public String convertToBase7_V1(int num) {
		return Integer.toString(num, 7);
	}
}
