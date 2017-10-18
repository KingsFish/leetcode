package leetcode.ex209;

public class Solutin{
    
    public int minSubArrayLen(int s, int[] nums) {
        int result = nums.length + 1;
        int left = 0, j =0;
        int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
            while(sum >= s){
                result = Math.min(result, i - left + 1);
                sum -= nums[left++];
            }
        }
        return result == nums.length + 1 ? 0 : result;
    }
}