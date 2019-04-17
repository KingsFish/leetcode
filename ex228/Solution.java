import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> summaryRanges(int [] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length < 1) {
            return res;
        }
        StringBuilder sv = new StringBuilder();
        int [] tmp = new int [nums.length];
        tmp[0] = 0;
        for(int i = 1; i < nums.length; i ++) {
            tmp[i] = nums[i] - nums[i - 1];
        }
        int j = 0, count = 0;
        while(j < tmp.length) {
            sv = new StringBuilder();
            sv.append(nums[j]);
            count = 1;
            while(j < tmp.length - 1) {
                if (tmp[j + 1] != 1) {
                    if (count != 1) {
                        sv.append("->");
                        sv.append(nums[j]);
                    }
                    res.add(sv.toString());
                    break;
                }
                count ++;
                j ++;
            }
            j ++;
            
        }
        // 最后连续处理
        if(tmp[j - 1] == 1) {
            sv.append("->");
            sv.append(nums[j - 1]);
        } else {
            sv = new StringBuilder();
            sv.append(nums[j - 1]);
        }
        res.add(sv.toString());
        return res;
    }
}