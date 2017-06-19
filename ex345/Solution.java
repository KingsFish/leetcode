package leetcode.ex345;

public class Solution {

	public String reverseVowels(String s) {
        int lo = 0, hi = s.length() - 1;
        char [] cs = s.toCharArray();
        while (lo < hi) {
        	while (lo < hi && !isVowel(cs[lo])) {
        		lo ++;
			}
        	while (lo < hi && !isVowel(cs[hi])) {
        		hi --;
        	}
        	char c = cs[lo];
        	cs[lo++] = cs[hi];
        	cs[hi--] = c;
		}
        return String.valueOf(cs);
    }
	
	private boolean isVowel(char c){
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}
