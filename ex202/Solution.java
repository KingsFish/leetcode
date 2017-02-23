package leetcode.ex202;

public class Solution {

	//Floyd判圈算法
	public boolean isHappy(int n) {
		int slow = n, fast = n;
		do {
			slow = getSum(slow);
			fast = getSum(fast);
			fast = getSum(fast);
		} while (slow != fast);
		if (slow == 1) {
			return true;
		} else {
			return false;
		}
    }
	private int getSum(int n){
		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
        return sum;
    }
}
