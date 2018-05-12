package leetcode.ex105;

import leetcode.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder);
    }
    private TreeNode build(int [] pre, int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int pos = findRoot(in, root.val);
        int [] pre_tmp = copy(pre, 1, pos);
        int [] in_tmp = copy(in, 0, pos - 1);
        root.left = build(pre_tmp, in_tmp);
        pre_tmp = copy(pre, pos + 1, pre.length - 1);
        in_tmp = copy(in, pos + 1, in.length - 1);
        root.right = build(pre_tmp, in_tmp);
        return root;
    }
    
    private int findRoot(int [] in, int val) {
        for (int i = 0; i < in.length; i ++) {
            if (in[i] == val) {
                return i;
            }
        }
        return 0;
    }
    
    private int[] copy(int [] array, int start, int end){
        int length = end - start + 1;
        int [] res = new int[length];
        for (int i = 0; i < length; i ++){
            res[i] = array[i + start];
        }
        return res;
    }
}