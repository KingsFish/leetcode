package leetcode.ex831;

class Solution {
    public String maskPII(String S) {
        S = S.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String [] tmp = S.split("@");       
        if (tmp.length > 1) {
            // mail
            int n = tmp[0].length();
            sb.append(tmp[0].charAt(0));
            sb.append("*****");
            sb.append(tmp[0].charAt(n - 1));
            sb.append("@");
            sb.append(tmp[1]);
        } else {
            // phone
            char [] chars = S.toCharArray();
            for (char c : chars) {
                if (c >= '0' && c <= '9'){
                    sb.append(c);
                }
            }
            String str = sb.substring(sb.length() - 4, sb.length());
            int num = sb.length();
            sb.delete(0, num);   
            if (num > 10){
                sb.append("+");
                for (int i = 10; i < num; i++) {
                    sb.append("*");
                }
                sb.append("-");
            }
            sb.append("***-***-");
            sb.append(str);
        }
        return sb.toString();
    }
}