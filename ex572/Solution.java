package leetcode.ex572;

import leetcode.TreeNode;

class Solution {
    boolean result = false;
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.val == t.val) {
            result = subTree(s, t);
        }
        if(!result) {
            result = isSubtree(s.left, t);
        }
        if (!result) {
            result = isSubtree(s.right, t);
        }
        return result;
    }
    
    private boolean subTree(TreeNode root1, TreeNode root2) {
        boolean res = false;
        if (root2 == null && root1 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            res = subTree(root1.left, root2.left);
        } else {
            return false;
        }
        if (res) {
            res = subTree(root1.right, root2.right);
        }
        return res;
    }
}