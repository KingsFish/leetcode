package leetcode.ex104;

public class Solution {

	int depth = 0;
	public int maxDepth(TreeNode root) {
        search(root, 1);
        return depth;
    }
	
	private void search(TreeNode root, int level){
		if (root == null) {
			return;
		}
		depth = Math.max(level, depth);
		search(root.left, level + 1);
		search(root.right, level + 1);
	}
}
