package leetcode.ex88;

public class Solution {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0) {
			return;
		}
		int [] temp = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < m || j < n) {
			int x = i < m ? nums1[i] : Integer.MAX_VALUE;
			int y = j < n ? nums2[j] : Integer.MAX_VALUE;
			if (x > y) {
				temp[k++] = y;
				j ++;
			} else {
				temp[k++] = x;
				i ++;
			}
		}
		k = 0;
		while (k < temp.length) {
			nums1[k] = temp[k];
			k ++;
		}
    }
	
	public void merge_v2(int[] nums1, int m, int[] nums2, int n){
		
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i >=0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
				
			}
		}
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
}
