package leetcode.ex46;

import java.util.ArrayList;
import java.util.List;
public class Solution{
    
    public List<List<Integer>> permute(int[] nums) {
        int length = 1;
        for (int i = 2; i <= nums.length; i ++){
            length *=i;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i ++){
            List<Integer> tmp = new ArrayList<>();
            
            int posi = nums.length - 2;
            int min = nums.length - 1;
            while (posi >= 0 && nums[posi] >= nums[posi + 1]){
                posi --;
            }
            if (posi == -1) {
                posi = 0;
            } else {
                while (min >= 0 && nums[min] < nums[posi]){
                    min --;
                }
                swap(nums, posi, min);
                posi ++;
                min = nums.length - 1;
            }
            while (posi < min){
                swap(nums, posi++, min--);
            }
            posi = 0;
            while(posi < nums.length){
                tmp.add(nums[posi++]);
            }
            result.add(tmp);
        }
        
        return result;
    }
    
    private void swap(int [] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}