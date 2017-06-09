package leetcode.ex173;

import java.util.Stack;

import leetcode.TreeNode;

public class BSTIterator {

	Stack<TreeNode> stack;
	public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        while (root != null) {
        	stack.push(root);
        	root = root.left;
		}
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
    	TreeNode tmp = stack.pop();
    	int val = tmp.val;
    	tmp = tmp.right;
    	while (tmp != null) {
    		stack.push(tmp);
    		tmp = tmp.left;
		}
        return val;
    }
}
