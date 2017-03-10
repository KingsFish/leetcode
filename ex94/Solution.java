package leetcode.ex94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.TreeNode;

public class Solution {
	
	
	public List<Integer> inorderTraversal(TreeNode root){
		//递归版本
		ArrayList<Integer> list = new ArrayList<>();
        recursive(root, list);
        return list;
	}
	
	private void recursive(TreeNode root, ArrayList<Integer> list){
		if (root == null) {
			return;
		}
		recursive(root.left, list);
		list.add(root.val);
		recursive(root.right, list);
	}
	
	public List<Integer> inorderTraversal_v2(TreeNode root) {
		//迭代版本
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode top = root;
        while (true) {
        	goAlongLeft(top, stack);
        	if (stack.isEmpty()) {
        		return list;
        	}
        	top = stack.pop();
        	list.add(top.val);
        	top = top.right;
		}
        
    }
	
	private void goAlongLeft(TreeNode root, Stack<TreeNode> stack){
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

}
