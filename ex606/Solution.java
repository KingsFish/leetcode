package leetcode.ex606;

import leetcode.TreeNode;

public class Solution {

	StringBuilder sb = new StringBuilder();
	public String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}
        traverse(t);
        return sb.toString();
    }
	
	private void traverse(TreeNode root){
		sb.append(root.val);
		if (root.left == null) {
			if (root.right == null) {
				return;
			} else {
				sb.append("()(");
				traverse(root.right);
				sb.append(")");
			}
		} else {
			sb.append("(");
			traverse(root.left);
			sb.append(")");
			if (root.right != null) {
				sb.append("(");
				traverse(root.right);
				sb.append(")");
			}
		}
	}
}
