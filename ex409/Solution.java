package leetcode.ex409;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public int longestPalindrome_v1(String s) {
	    char [] cs = s.toCharArray();
	    Arrays.sort(cs);
	    int result = 0;
	    boolean isSingle = false;
	    for (int i = 0; i < cs.length; i++) {
	    	int temp = i;
			while (i + 1 < cs.length && cs[i] == cs[i + 1]) {
				i++;
			}
			if (i != temp) {
				temp = i + 1 - temp;
				if (temp % 2 == 0) {
					result += temp;
				} else {
					result += temp - 1;
					isSingle = true;
				}
			} else {
				isSingle = true;
			}
		}
	    if (isSingle) {
			result += 1;
		}
	    return result;
	}
	
	public int longestPalindrome_v2(String s) {
		if(s==null || s.length()==0) return 0;
	    HashSet<Character> hs = new HashSet<Character>();
	    int count = 0;
	    for(int i=0; i<s.length(); i++){
	        if(hs.contains(s.charAt(i))){
	            hs.remove(s.charAt(i));
	            count++;
	        }else{
	            hs.add(s.charAt(i));
	        }
	    }
	    if(!hs.isEmpty()) return count*2+1;
	    return count*2;
	}
}
