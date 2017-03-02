package leetcode.ex14;

import java.util.Arrays;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
		if (strs.length < 2) {
			return strs.length == 0 ? "" : strs[0];
		}
        int i = 0, j = 0;;
        StringBuffer buffer = new StringBuffer();
        //get the common string between first and the second String
        for (; i < strs[0].length() && i < strs[1].length(); i++) {
			if (strs[0].charAt(i) != strs[1].charAt(i)) {
				break;
			}
			buffer.append(strs[0].charAt(i));
		}
        for (i = 2; i < strs.length && buffer.length() > 0 ; i++) {
        	for (j = 0; j < strs[i].length() && j < buffer.length(); j++) {
				if (strs[i].charAt(j) != buffer.charAt(j)) {
					break;
				}
			}
        	buffer.delete(j, buffer.length());
		}
        return buffer.toString();
    }
	
	
	public String longestCommonPrefix_v2(String[] strs) {
		StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
            Arrays.sort(strs);
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        }
        return result.toString();
	}
}
