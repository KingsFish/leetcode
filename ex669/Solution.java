package leetcode.ex669;

import leetcode.TreeNode;

class Solution {
    
    // 循环版本
    public TreeNode trimBST_v1(TreeNode root, int L, int R) {
        
        while(root != null) {
            if (root.val > R) {
                root = root.left;
            } else if (root.val < L) {
                root = root.right;
            } else {
                break;
            }
        }
        TreeNode last = root;
        TreeNode tmp = root.left;
        while(tmp != null) {
            if (tmp.val > L) {
                last = tmp;
                tmp = tmp.left;
            } else if (tmp.val < L) {
                last.left = tmp.right;
                tmp = tmp.right;
            } else {
                tmp.left = null;
                tmp = null;
            }
        }
        last = root;
        tmp = root.right;
        while(tmp != null) {
            if (tmp.val > R) {
                last.right = tmp.left;
                tmp = tmp.left;
            } else if (tmp.val < R) {
                last = tmp;
                tmp = tmp.right;
            } else {
                tmp.right = null;
                tmp = null;
            }
        }
        return root;
    }
    
    // 递归版本
    public TreeNode trimBST_v2(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        
        if (root.val > R) {
            return trimBST_v2(root.left, L, R);                  
        }
        if (root.val < L) {
            return trimBST_v2(root.right, L, R);
        }
        
        root.left = trimBST_v2(root.left, L, R);
        root.right = trimBST_v2(root.right, L, R);
        return root;
    
    }
}