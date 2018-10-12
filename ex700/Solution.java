package leetcode.ex700;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null) {
            if(root.val < val) {
                root = root.right;
            } else if(root.val > val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null;
    }
}