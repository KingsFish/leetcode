package leetcode.ex905;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        while(start < end) {
            while(start < end && A[start] % 2 == 0) {
                start ++;
            }
            while(end > start && A[end] % 2 == 1) {
                end --;
            }
            if(start < end) {
                int tmp = A[start];
                A[start] = A[end];
                A[end] = tmp;
            } else {
                break;
            }
        }
        return A;
    }
}