package leetcode.ex455;

import java.util.Arrays;

public class Solution {

	public int findContentChildren(int[] g, int[] s) {
		//g->kids,s->cookies
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;
        int result = 0;
        while (i >= 0 && j >= 0) {
        	if (s[j] >= g[i]) {
				i --;
				j--;
				result ++;
			} else {
				i--;
			}
		}
        return result;
    }
}
