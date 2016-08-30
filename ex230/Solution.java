package leetcode.ex230;

import java.util.Stack;

public class Solution {

	public int kthSmallest(TreeNode root, int k) {
		int [] list = new int[k];
		Stack<TreeNode> s = new Stack<>();
		s.clear();
		int i = 0;
		while (true) {
			if (i == k) {
				break;
			}
			goAlongLeft(s, root);
			root = s.pop();
			list[i++] = root.val;
			root = root.right;
		}
		return list[--i];
    }

	private void goAlongLeft(Stack<TreeNode> s, TreeNode x){
		while (x != null) {
			s.push(x);
			x = x.left;
		}
	}
}
