package leetcode.ex167;

import java.util.HashMap;

public class Solution {
	
	public static void main(String[] args) {
		Solution ex = new Solution();
		int [] numbers = new int []{5,25,75};
		int [] result = ex.twoSumV2(numbers, 100);
		for (int i : result) {
			System.out.print(i + ",");
		}
	}
	
	public int[] twoSumV2(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int result = binarySearch(numbers, target - numbers[i], i);
			if (result != -1 && result != i) {
				return new int [] {Math.min(i, result) + 1, Math.max(i, result) + 1};
			}
		}
		throw new IllegalArgumentException("No two-sum solution");
	}
	
	private int binarySearch(int [] numbers, int target, int begin){
		int lo = 0;
		int hi = numbers.length;
		int mi = 0;
		while (lo < hi) {
			mi = lo + (hi - lo) / 2;
			if (numbers[mi] < target) {
				lo = mi + 1;
			} else {
				hi = mi;
			}
		}
		if (lo < numbers.length && numbers[lo] == target) {
			return lo;
		} else {
			return -1;
		}
	}
}
