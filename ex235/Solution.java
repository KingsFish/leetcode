package leetcode.ex235;

public class Solution{
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            int min = Math.min(p.val, q.val);
            int max = Math.max(p.val, q.val);
            if (root.val >= min && root .val <= max){
                return root;
            } else if (root.val > max){
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}