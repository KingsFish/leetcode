package leetcode.ex513;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {

	int result = 0, depth = 0;
	//7ms
	public int findBottomLeftValue_v1(TreeNode root) {
		result = root.val;
        trevers(root, 0);
        return result;
    }
    private void trevers(TreeNode root, int level){
    	if (root == null) {
			return;
		}
    	if (depth < level) {
			result = root.val;
			depth = level;
		}
    	trevers(root.left, level + 1);
    	trevers(root.right, level + 1);
	}
	
	//16ms
	public int findBottomLeftValue_v2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        trevers(root, 0, result);
        return result.get(result.size() - 1).get(0);
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
		tmp.add(root.val);
	}
}
