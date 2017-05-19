package leetcode.ex383;

public class Solution {

	public boolean canConstruct(String ransomNote, String magazine) {
        int [] letters = new int [26];
        for (int i = 0; i < magazine.length(); i++) {
        	letters[magazine.charAt(i) - 'a'] ++;
		}
        for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			if (letters[c - 'a'] == 0) {
				return false;
			} else {
				letters[c - 'a'] --;
			}
		}
        return true;
    }
}
