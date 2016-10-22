package leetcode.ex9;

public class Solution {
	
	public boolean isPalindrome(int x) {
        if (x < 0) {
			return false;
		} else if (x < 10) {
			return true;
		}
        int length = 2;
        while (true) {
        	if (x < Math.pow(10, length)) {
        		break;
			} else {
				length ++;
			}
		}
        for (; length > 0; length -= 2) {
        	if ((x / (int) Math.pow(10, length - 1)) != (x % 10)) {
				return false;
			}
        	x = x % (int) (Math.pow(10, length - 1)) / 10;
		}
        return true;
    }
}
