package leetcode.ex103;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
        trevers(root, 0, result);
        return result;
    }
	
	private void trevers(TreeNode root, int level, List<List<Integer>> result){
		if (root == null) {
			return;
		}
		List<Integer> tmp;
		if (level >= result.size()) {
			tmp = new ArrayList<>();
			result.add(level, tmp);
		} else {
			tmp = result.get(level);
		}
		trevers(root.left, level + 1, result);
		trevers(root.right, level + 1, result);
		if (level % 2 == 0) {
			tmp.add(root.val);
		} else {
			tmp.add(0, root.val);
		}
	}
}
