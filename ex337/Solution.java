package leetcode.ex337;

import leetcode.TreeNode;

public class Solution {
    public int rob(TreeNode root) {
        return search(root)[1];
    }
    
    private int[] search(TreeNode root){
        int [] rob = new int[]{0, 0};
        if (root != null){
            int [] robLeft = search(root.left);
            int [] robRight = search(root.right);
            rob[0] = robLeft[1] + robRight[1];
            rob[1] = Math.max(rob[0], robLeft[0] + robRight[0] + root.val);
        }
        return rob;
    }
}