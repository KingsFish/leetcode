package leetcode.ex7;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(Integer.valueOf(Solution.reverse(-1000)));
	}
	
	public static int reverse(int x) {
        String str = x + "";
        char [] bytes = str.toCharArray();
        int lo = bytes[0] == '-' ? 1 : 0;
        int hi = bytes.length - 1;
        while (lo < hi) {
        	char temp = bytes[hi];	
			bytes[hi--] = bytes[lo];
			bytes[lo++] = temp; 
		}
        try {
			int value = Integer.valueOf(String.valueOf(bytes));
			return value;
		} catch (NumberFormatException e) {
			return 0;
		}
    }
}
