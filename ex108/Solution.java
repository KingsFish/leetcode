package leetcode.ex108;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] nums = new int[]{2,9,11,20,21};
		TreeNode x = solution.sortedArrayToBST(nums);
		solution.inOrder_v1(x);
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        return findNode(nums, 0, nums.length);
    }
	
	private TreeNode findNode(int[] nums, int lo, int hi){
		if (hi - lo < 1) {
			return null;
		}
		int mid = (lo + hi) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = findNode(nums, lo, mid);
		node.right = findNode(nums, mid + 1, hi);
		return node;
	}
	
	private void inOrder_v1(TreeNode x){ 
		//供测试使用
		//中序遍历,递归版本
		if (x == null) {
			return;
		}
		inOrder_v1(x.left);
		System.out.print(x.val + ",");
		inOrder_v1(x.right);
	}
	
}
