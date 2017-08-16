package leetcode.ex654;

import leetcode.TreeNode;

public class Solution {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getTree(nums, 0, nums.length - 1);
    }
	
	private TreeNode getTree(int [] nums, int lo, int hi){
        if (lo > hi) {
			return null;
		}
		TreeNode root;
		if (lo == hi) {
			root = new TreeNode(nums[lo]);
		} else {
			int max_posi = lo;
			int posi = lo + 1;
			while (posi <= hi) {
				if (nums[posi] > nums[max_posi]) {
					max_posi = posi;
				}
				posi ++;
			}
			root = new TreeNode(nums[max_posi]);
			root.left = getTree(nums, lo, max_posi - 1);
			root.right = getTree(nums, max_posi + 1, hi);
		}
		return root;
		
	}
}
