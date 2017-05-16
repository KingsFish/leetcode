package leetcode.ex451;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public String frequencySort(String s) {
        int [] temp = new int [95];
        HashMap<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
    		temp[s.charAt(i) - 32] ++; 
		}
        for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 0) {
				continue;
			}
			if (map.containsKey(temp[i])) {
				sb.delete(0, sb.length());
				sb.append(map.get(temp[i]) + "," + i);
				map.put(temp[i], sb.toString());
			} else {
				map.put(temp[i], i + "");
			}
		}
        Arrays.sort(temp);
        sb.delete(0, sb.length());
        for (int i = temp.length - 1; i >= 0; i--) {
        	if (temp[i] == 0) {
        		break;
        	}
        	while (i >= 1 && temp[i] == temp[i - 1]) {
        		i --;
			}
			String [] c = map.get(temp[i]).split(",");
			for (int j = 0; j < c.length; j++) {
				for (int k = 0; k < temp[i]; k++) {
					int tmp = Integer.valueOf(c[j]) + 32;
					sb.append((char) tmp);
				}
			}
		}
        return sb.toString();
    }
	
	public String frequencySort_v2(String s) {
		//复杂度是O(n2)，但是实际上总运行时长比上一个要好。。
		int[] map = new int[123];
	    char[] letters = s.toCharArray();
	    for(int i=0; i<letters.length; i++){
	        map[letters[i]]++;
	    }
	    int index =0;
	    while(true){
	        int max = 0;
	        int letter=0;
	        for(int j=' '; j<='z'; j++){
	            if(max < map[j]){
	                max = map[j];
	                letter = j;
	            }
	        }
	        for(int num=max; num>0;num--){
	            letters[index] = (char)letter;
	            index++;
	        }
	        map[letter] = 0;
	        if(max == 0){
	            break;
	        }
	    }
	    return String.valueOf(letters);
	}
}
