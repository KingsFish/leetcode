package leetcode.ex98;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {

	public boolean isValidBST_v1(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
	
	public boolean isValidBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		search(root, list);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) <= list.get(i - 1)) {
				return false;
			}
		}
        return true;
    }
	
	private void search(TreeNode root, List<Integer> list){
		if (root == null) {
			return;
		}
		search(root.left, list);
		list.add(root.val);
		search(root.right, list);
	}
}
