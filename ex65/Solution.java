package leetcode.ex65;

public class Solution {

	public static void main(String[] args) {
		isNumber("959440.94F");
	}
	
	public static boolean isNumber(String s) {
		char temp = s.charAt(s.length() - 1);
		if (temp == 'f' || temp == 'd' || temp == 'D' || temp == 'F') {
			return false;
		}
        try {
    	   System.out.println(Double.parseDouble(s));
		   return true;
		} catch (NumberFormatException e) {
			return false;
	    }
	}
}
