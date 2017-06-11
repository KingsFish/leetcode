package leetcode.ex257;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
        StringBuilder sb = new StringBuilder();
        traverse(root, sb, result);
        return result;
    }
	
	private void traverse(TreeNode root, StringBuilder sb, List<String> result){
		sb.append(root.val + "->");
		int length = ("" + root.val).length();
		if (root.left == null && root.right == null) {
			sb.delete(sb.length() - 2, sb.length());
			result.add(sb.toString());
			sb.delete(sb.length() - length, sb.length());
			return;
		} else {
			if (root.left != null) {
				traverse(root.left, sb, result);
			}
			if (root.right != null) {
				traverse(root.right, sb, result);
			}
		}
		sb.delete(sb.length() - (2 + length), sb.length());
	}
}
