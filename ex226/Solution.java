package leetcode.ex226;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
        afterOrder(root);
        return root;
    }
    
    private void afterOrder(TreeNode x){
        if (x == null) {
			return;
		}
		afterOrder(x.left);
		afterOrder(x.right);
		TreeNode left = x.right;
		x.right = x.left;
		x.left = left;
    }
}
