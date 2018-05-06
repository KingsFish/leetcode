package leetcode.ex829;

class Solution {
    public int consecutiveNumbersSum(int N) {
        int count = 0;
        
        for(int i = 1; i <= N; i++){
            int sum = (i - 1) * i / 2;
            if(sum >= N) break;
            int na = N - sum;
            int a = na / i;
            if(a * i == na){
                count ++;
            }
        }
        return count;
    }
}