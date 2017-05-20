package leetcode.ex111;

import leetcode.TreeNode;

public class Solution {

	int depth = Integer.MAX_VALUE;
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		search(root, 1);
        return depth;
    }
	
	private void search(TreeNode root, int level){
		if (root.left == null && root.right == null) {
			depth = Math.min(depth, level);
			return;
		}
		if (root.left != null){
			search(root.left, level + 1);
		}
		if (root.right != null) {
			search(root.right, level + 1);
		}
	}
}
