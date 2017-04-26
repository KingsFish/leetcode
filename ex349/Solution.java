package leetcode.ex349;

import java.util.HashSet;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> list = new HashSet<>();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			set.add(nums2[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			if (set.contains(nums1[i]) && !list.contains(nums1[i])) {
				list.add(nums1[i]);
			}
		}
		int [] result = new int[list.size()];
		int i = 0;
		for (int num : list) {
			result[i++] = num;
		}
		return result;
    }
}
