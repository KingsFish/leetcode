package leetcode.ex404;

public class Solution {

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return search(root, 1);
	}
	
	private int search(TreeNode root, int type){
		if (root.left == null && root.right == null && type == 0) {
			return root.val;
		}
		int left = 0, right = 0;
		if (root.left != null) {
			left = search(root.left, 0);
		}
		if (root.right != null) {
			right = search(root.right, 1);
		}
		return left + right;
	}
}
