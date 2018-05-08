package leetcode.ex811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : cpdomains) {
            String [] pairs = str.split(" ");
            int number = Integer.valueOf(pairs[0]);
            map.put(pairs[1], map.getOrDefault(pairs[1], 0) +number);
            String [] tmp = pairs[1].split("\\.");
            if (tmp.length == 3 ){
                String st = tmp[1] + "." + tmp[2];
                map.put(st, map.getOrDefault(st, 0) + number);
                map.put(tmp[2], map.getOrDefault(tmp[2], 0) + number);
            } else {
                map.put(tmp[1], map.getOrDefault(tmp[1], 0) + number);
                
            }
        }
        for (String key : map.keySet()){
            res.add(map.get(key) + " " + key);
        }
        return res;
    }
}