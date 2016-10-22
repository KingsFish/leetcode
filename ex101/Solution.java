package leetcode.ex101;



//ex101
public class Solution {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(5);
		a.left = b;
		b.left = d;
		b.right = e;
		a.right = c;
		c.left = f;
		
		
		Solution solution = new Solution();
		System.out.println(solution.isSymmetric(a));
	}
	
	
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return equal(root.left, root.right);
    }
	
	private boolean equal(TreeNode left, TreeNode right){
		if ((left == null && right != null) || (left != null && right == null)) {
			return false;
		} else {
			if (left == null && right == null) {
				return true;
			} else {
				if (left.val != right.val) {
					return false;
				} else {
					if (equal(left.left, right.right)) {
						return equal(left.right, right.left);
					} else {
						return false;
					}
				}
			}
		}
		
		
	}
}
