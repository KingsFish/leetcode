package leetcode.ex617;

import leetcode.TreeNode;

public class Solution {
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return search(t1, t2);
    }

	private TreeNode search(TreeNode t1, TreeNode t2){
		if (t1 == null & t2 == null) {
			return null;
		} else {
			int val1 = t1 == null ? 0 : t1.val;
			int val2 = t2 == null ? 0 : t2.val;
			TreeNode tmp = new TreeNode(val1 + val2);
			tmp.left = search(t1 == null ? t1 : t1.left, t2 == null ? t2 : t2.left);
			tmp.right = search(t1 == null ? t1 : t1.right, t2 == null ? t2 : t2.right);
			return tmp;
		}
	}
}
