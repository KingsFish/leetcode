package leetcode.ex357;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 10, base = 9;
        for (int i = 2; i <= 10 && i <= n; i++){
            base *= 9 - i + 2;
            ans += base;
        }
        return ans;
    }
}