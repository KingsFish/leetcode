package leetcode.ex423;

public class Solution {
    public String originalDigits(String s) {
        int [] chars = new int [26];
        for (char c : s.toCharArray()){
            chars[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int [] nums = new int[10];
        nums[0] = chars['z' - 'a'];
        nums[2] = chars['w' - 'a'];
        nums[6] = chars['x' - 'a'];
        nums[4] = chars['u' - 'a'];
        nums[8] = chars['g' - 'a'];
        nums[3] = chars['h' - 'a'] - nums[8];
        nums[7] = chars['s' - 'a'] - nums[6];
        nums[5] = chars['v' - 'a'] - nums[7];
        nums[1] = chars['o' - 'a'] - nums[0] - nums[2] - nums[4];
        nums[9] = chars['i' - 'a'] - nums[5] - nums[6] - nums[8];
        
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < nums[i]; j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}