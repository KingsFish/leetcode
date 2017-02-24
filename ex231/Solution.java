package leetcode.ex231;

import cn.fish.Test;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo_v1(5));
	}

	public boolean isPowerOfTwo(int n) {
		while (n % 2 == 0 && n != 0) {
			n /= 2;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPowerOfTwo_v1(int n) {
		if (n <= 0) {
			return false;
		}
		return Integer.highestOneBit(n) == n ? true : false;
	}
}
