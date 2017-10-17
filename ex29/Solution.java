package leetcode.ex29;

import java.util.ArrayList;

public class Solution{
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        ArrayList<Long> list = new ArrayList<>();
        int end = dividend > 0 ? 1 : 0;
        int sor = divisor > 0 ? 1 : 0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int ret = 0;
        list.add(b);
        long i = 1;
        while (b <= a){
            b += b;
            i += i;
            list.add(b);
        }
        long sum = 0;

        for (int j = list.size() - 2; j >= 0; j --){
            i >>= 1;
            if (sum + list.get(j) <= a){
                ret += i;
                sum += list.get(j);
            }
        }
        if (end + sor == 1){
            return -ret;
        } else {
            return ret;
        }
    }
}