package leetcode.ex563;

public class Solution {

	int sum = 0;
	public int findTilt(TreeNode root) {
        search(root);
        return sum;
    }
	
	private int search(TreeNode root){
		if (root == null) {
			return 0;
		}
		int left = search(root.left);
		int right = search(root.right);
		root.val += left + right;
		sum += Math.abs(left - right);
		return root.val;
    }
}
