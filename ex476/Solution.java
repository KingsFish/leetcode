package leetcode.ex476;

public class Solution {

	public int findComplement(int num) {
        int temp = Integer.highestOneBit(num);
        temp <<= 1;
        temp -= 1;
        return temp & ~num;
    }
}
