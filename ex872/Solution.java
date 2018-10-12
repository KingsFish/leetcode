package leetcode.ex872;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = search(root1);
        List<Integer> nums2 = search(root2);
        if(nums1.size() != nums2.size()) {
            return false;
        }
        for(int i = 0; i < nums1.size(); i ++) {
            if(nums1.get(i) != nums2.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private List<Integer> search(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        search(node, list);
        return list;
    }
    
    private void search(TreeNode node, List<Integer> list) {
        if(node.left == null && node.right == null) {
            list.add(node.val);
        }
        if(node.left != null) {
            search(node.left, list);
        }
        if(node.right != null) {
            search(node.right, list);
        }
    } 
}