package leetcode.ex557;

public class Solution {

	public String reverseWords(String s) {
		int lo = 0, hi = 0;
		char [] temp = s.toCharArray();
		for (int i = 0; i < temp.length;) {
			while (i < temp.length && temp[i] == ' '){
				i ++;
			}
			lo = i;
			while (i < temp.length && temp[i] != ' '){
				i ++;
			}
			hi = i - 1;
			exchange(temp, lo, hi);
		}
		return new String(temp);
    }
	private void exchange(char [] s, int lo, int hi){
		char temp;
		while (lo < hi) {
			temp = s[lo];
			s[lo++] = s[hi];
			s[hi--] = temp;
		}
	}
}
