package leetcode.ex481;

public class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;
        int [] tmp = new int[n + 1];
        int fast = 4, slow = 3, result = 1, num = 1;
        tmp[0] = 0;
        tmp[1] = 1;
        tmp[2] = 2;
        tmp[3] = 2;
        while (fast <= n){
            if (num == 1){
                result += fast + tmp[slow] > n ? n - fast + 1 : tmp[slow];
            }
            int tar = fast + tmp[slow];
            while(fast <= n && fast < tar){
                tmp[fast++] = num;
            }
            slow ++;
            num = num == 1 ? 2 : 1;
        }
        return result;
    }
    
}