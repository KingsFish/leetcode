package leetcode.ex543;

import leetcode.TreeNode;

public class Solution {

	int depth = 0;
	public int diameterOfBinaryTree(TreeNode root) {
        search(root);
        return depth;
    }
	
	private int search(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = search(root.left);
		int right = search(root.right);
		if (depth < left + right) {
			depth = left + right;
		}
		return left > right ? left + 1 : right + 1;
	}
}
