package leetcode.ex515;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		search(root, 0, list);
		return list;
	}
	
	private void search(TreeNode root, int d, List<Integer> list){
		if (root == null) {
			return;
		}
		if (d == list.size()) {
			list.add(root.val);
		} else {
			list.add(d, Math.max(list.get(d), root.val));
		}
		search(root.left, d + 1, list);
		search(root.right, d + 1, list);
		
	}
}
