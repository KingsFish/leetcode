package leetcode.ex76;

import java.util.HashMap;

public class Solution{
    public String minWindow(String s, String t) {
        int result_l = 0, result_r = 0;
        int left = 0, min = s.length() + 1;
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        for(char c : t.toCharArray()){
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
            while (contains(maps, mapt)){
                if(min > i - left + 1){
                    min = i - left + 1;
                    result_l = left;
                    result_r = i;
                }
                maps.put(s.charAt(left), maps.get(s.charAt(left)) - 1);
                left ++;
            }
        }
        return min == s.length() + 1 ? "" : s.substring(result_l, result_r + 1);
    }
    
    private boolean contains(HashMap<Character, Integer> maps, HashMap<Character, Integer> mapt){
        for(char c : mapt.keySet()){
            if (maps.getOrDefault(c, 0) < mapt.getOrDefault(c, 0)){
                return false;
            }
        }
        return true;
    }
}