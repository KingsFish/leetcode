package leetcode.ex199;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, 0, list);
        return list;
    }
	
	private void traverse(TreeNode root, int level, List<Integer> list){
		if (root == null) {
			return;
		}
		if (level >= list.size()) {
			list.add(root.val);
		}
		traverse(root.right, level + 1, list);
		traverse(root.left, level + 1, list);
	}
}
