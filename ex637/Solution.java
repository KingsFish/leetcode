package leetcode.ex637;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

public class Solution {
    List<Integer> times;
	List<Double> list;
	public List<Double> averageOfLevels(TreeNode root) {
		list = new ArrayList<>();
		times = new ArrayList<>();
		getLevel(root, 0);
		for(int i = 0; i < list.size(); i ++){
			list.set(i, list.get(i) / times.get(i));
		}
		return list;
	}
	
	private void getLevel(TreeNode root, int level){
        if (root == null) {
            return;
        }
		if (level >= list.size()) {
			list.add((double) root.val);
			times.add(1);
		} else {
			list.set(level, list.get(level) + root.val);
			times.set(level, times.get(level) + 1);
		}
		getLevel(root.left, level + 1);
		getLevel(root.right, level + 1);
    }
}