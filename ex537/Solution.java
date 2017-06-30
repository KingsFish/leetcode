package leetcode.ex537;

public class Solution {

	public String complexNumberMultiply(String a, String b) {
        int [] nums1 = dom(a);
        int [] nums2 = dom(b);
        int first = nums1[0] * nums2[0] - nums1[1] * nums2[1];
        int second = nums1[0] * nums2[1] + nums1[1] * nums2[0];
        return first + "+" + second + "i";
    }
	
	private int [] dom(String s){
		String [] str = split(s);
		int [] nums = new int[2];
		nums[0] = Integer.valueOf(str[0]);
		str[1] = str[1].substring(0, str[1].length() - 1);
		nums[1] = Integer.valueOf(str[1]);
		return nums;
	}
	
	private String [] split(String s){
		int lo = 0;
		while (s.charAt(lo) != '+') {
			lo ++;
		}
		String [] str = new String[2];
		str[0] = s.substring(0, lo);
		str[1] = s.substring(lo + 1, s.length());
		return str;
	}
}
