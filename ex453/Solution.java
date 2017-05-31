public class Solution{
	public int minMoves(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for(int tmp : nums){
            if (min > tmp){
                min = tmp;
            }
            sum += tmp;
        }
        return sum - nums.length * min;
    }
}