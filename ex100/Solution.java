package leetcode.ex100;

import leetcode.TreeNode;

public class Solution {

	boolean isSame = true;
	public boolean isSameTree(TreeNode p, TreeNode q) {
		search(p, q);
		return isSame;
    }
	
	private void search(TreeNode p, TreeNode q){
		if (!isSame) {
			return;
		}
		if (q != null && p != null) {
			if (q.val == p.val) {
				search(p.left, q.left);
				search(p.right, q.right);
			} else {
				isSame = false;
			}
		} else if ((q != null && p == null) || (q == null && p != null)) {
			isSame = false;
		}
	}
}
