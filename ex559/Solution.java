package leetcode.ex559;

import java.util.List;

class Solution {
    public int maxDepth(Node root) {
        return search(root);
    }
    
    private int search(Node root) {
        if(root == null) {
            return 0;
        }
        List<Node> list = root.children;
        int max = 0;
        for(Node node : list) {
            int res = search(node);
            max = max > res ? max : res;
        }
        return max + 1;
    }
    
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}