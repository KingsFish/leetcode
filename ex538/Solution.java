package leetcode.ex538;

import leetcode.TreeNode;

public class Solution {

	public TreeNode convertBST(TreeNode root) {
        traverse(root, 0);
        return root;
    }
	
	private int traverse(TreeNode root, int val){
		if (root == null) {
			return 0;
		}
		int right = traverse(root.right, val);
		root.val += right + val;
		int left = traverse(root.left, root.val);
		return left + root.val - val;
	}
}
