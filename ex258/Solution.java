package leetcode.ex258;

public class Solution {
	//数根(Digital Root)问题
	public int addDigits(int num) {
		int result = 0;
        while (num >= 10) {
        	while (num != 0) {
				result += num % 10;
				num /= 10;
			}
        	num = result;
        	result = 0;
        }
        return num;
    }
	public int addDigits_v2(int num) {
		return 1 + ((num - 1) % 9);
	}
	
}
