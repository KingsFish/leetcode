package leetcode.ex31;

public class Solution{
    public void nextPermutation(int[] nums) {
        int posi = nums.length - 2;
        for (; posi >= 0; posi--){
            if (nums[posi] < nums[posi + 1]){
                break;
            }
        }
        if(posi == -1){
            posi++;
            while (posi < nums.length / 2){
                swap(nums, posi, nums.length - posi - 1);
                posi++;
            }
            return;
        }
        int sec = nums.length - 1;
        while(sec > posi){
            if(nums[sec] > nums[posi]){
                break;
            }
            sec --;
        }
        swap(nums, posi, sec);
        sec = nums.length - 1;
        posi ++;
        while(posi < sec){
            swap(nums, posi++, sec--);
        }
        
    }
    private void swap(int [] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}