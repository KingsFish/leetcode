package leetcode.ex114;

import leetcode.TreeNode;

class Solution {
    TreeNode last = null;
    public void flatten(TreeNode root) {
        TreeNode head = root;
        search(head);
    }
    
    private void search(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode tmp = root.right;
        if (last != null) {
            last.right = root;
        }
        last = root;
        search(root.left);
        root.left = null;
        search(tmp);
    }
}