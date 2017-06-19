package leetcode.ex405;

public class Solution {

	public String toHex_v1(int num) {
		if(num == 0) {
	        return "0";
	    }
	    StringBuilder res = new StringBuilder();
	    for(int i=0; i<8 && num!=0; ++i) {
	        int t = num & 0xf;
	        char ch = t < 10 ? (char)('0' + t) : (char)('a' + t - 10);
	        res.append(ch);
	        num >>= 4;
	    }
	    return res.reverse().toString();
	}
	
	public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        long tmp = Long.valueOf("ffffffff", 16) + 1;
        if (num < 0) {
			tmp += num;
		} else {
			tmp = num;
		}
        while (tmp != 0) {
        	if (tmp % 16 >= 10) {
        		sb.append((char)(tmp % 16 + 87));
			} else {
				sb.append(tmp % 16);
			}
        	tmp /= 16;
		}
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}
