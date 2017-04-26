package leetcode.ex350;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
			if (map1.get(nums1[i]) == null) {
				map1.put(nums1[i], 1);
			} else {
				map1.put(nums1[i], map1.get(nums1[i]) + 1);
			}
		}
		for (int i = 0; i < nums2.length; i++){
		    if (map1.containsKey(nums2[i]) && map1.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map1.put(nums2[i], map1.get(nums2[i]) - 1);
            }
		}
        int [] result = new int [list.size()];
        for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
        return result;
    }
}
