package leetcode.ex125;

public class Solution {
	public boolean isPalindrome(String s) {
		int lo = 0, hi = s.length() - 1;
        if(lo == hi){
            return true;
        }
        while (lo < hi) {
        	char lo_char = s.charAt(lo);
        	char hi_char = s.charAt(hi);
        	if (!isValid(lo_char)) {
				lo ++;
				continue;
			}
        	if (!isValid(hi_char)) {
				hi --;
				continue;
			}
        	if (Character.toLowerCase(hi_char) == Character.toLowerCase(lo_char)) {
				lo ++;
				hi --;
			} else {
				return false;
			}
		}
        return true;
    }
	
	private boolean isValid(char c){
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
			return true;
		} else {
			return false;
		}
	}
}
