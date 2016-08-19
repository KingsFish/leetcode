package leetcode.ex344;

public class Solution {
	
	public String reverseString(String s) {
		char [] temp = s.toCharArray();
		for (int i = 0; i < (temp.length) / 2; i++) {
			char str = temp[i];
			temp[i] = temp[temp.length - i - 1];
			temp[temp.length - i - 1] = str;
			
		}
		return String.valueOf(temp);
    }
}
