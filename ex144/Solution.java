package leetcode.ex144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.TreeNode;

public class Solution {

	//iteratively
	public List<Integer> preorderTraversal_v1(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			TreeNode tmp;
			goAlongLeft(root, stack, list);
			while (!stack.empty()) {
				tmp = stack.pop();
				goAlongLeft(tmp.right, stack, list);
			}
		}
        return list;
    }
	
	private void goAlongLeft(TreeNode root, Stack<TreeNode> stack, List<Integer> list){
		while (root != null) {
			stack.push(root);
			list.add(root.val);
			root = root.left;
		}
	}
	
	//Recursive
	public List<Integer> preorderTraversal_v2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }
	
	private void traverse(TreeNode root, List<Integer> list){
		if (root == null) {
			return;
		}
		list.add(root.val);
		traverse(root.left, list);
		traverse(root.right, list);
	}
}
