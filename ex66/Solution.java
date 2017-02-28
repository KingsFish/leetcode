package leetcode.ex66;

public class Solution {
	public int[] plusOne(int[] digits) {
		boolean isNew = true;
		int i = digits.length - 1;
		for (; i >= 0; i--) {
			if (digits[i] != 9) {
				isNew = false;
				break;
			}
		}
		if (isNew) {
			//全部都为9，创建新的数组
			int [] result = new int [digits.length + 1];
			result[0] = 1;
			return result;
		} else {
			//无需创建新的数组
			digits[i] = digits[i] + 1;
			i ++;
			for (; i < digits.length; i ++) {
				digits[i] = 0;
			}
			return digits;
		}
        
    }
}
