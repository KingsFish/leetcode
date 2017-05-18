package leetcode.ex110;

public class Solution {

	boolean isBalanced = true;
	public boolean isBalanced(TreeNode root) {
        search(root);
		return isBalanced;
    }
	
	private int search(TreeNode root){
		if (!isBalanced) {
			return 0;
		}
		if (root == null) {
			return 0;
		}
		int left = search(root.left);
		int right = search(root.right);
		if (Math.abs(left - right) > 1) {
			isBalanced = false;
		}
		return Math.max(left, right) + 1;
	}
}
