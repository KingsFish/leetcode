package leetcode.ex191;

public class Solution {

	public int hammingWeight(int n) {
		int result = 0;
		while (n != 0) {
			//不能用n > 0判定，因为题目给定的是无符号，因此2^32 - 1在int里表示的是-2147483648，所以要用n != 0
			result = (n & 1) == 1 ? result + 1 : result;
			//使用无符号右移
			n >>>= 1;
		}
		return result;
    }
}
