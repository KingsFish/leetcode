package leetcode.ex112;

import leetcode.TreeNode;

public class Solution {

	boolean hasPathSum = false;
	int tmp = 0;
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		traverse(root, sum);
		return hasPathSum;
    }
	
	private void traverse(TreeNode root, int result){
		if (hasPathSum) {
			return;
		}
		tmp += root.val;
		if (root.left == null && root.right == null) {
			if (tmp == result) {
				hasPathSum = true;
			}
			tmp -= root.val;
			return;
		} else {
			if (!hasPathSum && root.left != null) {
				traverse(root.left, result);
			}
			if (!hasPathSum && root.right != null) {
				traverse(root.right, result);
			}
		}
		tmp -= root.val;
	}
}
