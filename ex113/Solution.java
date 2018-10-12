package leetcode.ex113;

import java.util.List;
import java.util.ArrayList;
import leetcode.TreeNode;

public class Solution {
    List<List<Integer>> res = null;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        search(tmp, root, sum, 0);
        return res;
    }
    
    private void search(ArrayList<Integer> tmp, TreeNode root, int target, int cursum) {
        cursum += root.val;
        tmp.add(root.val);
        if (root.left == null && root.right == null && cursum == target) {
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(tmp);
            res.add(list);
        }
        if (root.left != null) {
            search(tmp, root.left, target, cursum);
        }
        if (root.right != null) {
            search(tmp, root.right, target, cursum);
        }
        cursum -= root.val;
        tmp.remove(tmp.size() - 1);
    }
}