package leetcode.ex728;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left < 10){
            result.add(left);
            left ++;
        }
        while(left <= right){
            if (canDivide(left)){
                result.add(left);
            }
            left ++;
        }
        return result;
    }
    
    private boolean canDivide(int num){
        int times = 10, num_bak = num;
        while(num != 0){
            int tmp = num % times;
            if (tmp == 0 || num_bak % tmp != 0){
                return false;
            }
            num /= times;
        }
        return true;
    }
}