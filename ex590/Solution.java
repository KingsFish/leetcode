package leetcode.ex590;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        search(list, root);
        return list;
    }
    
    private void search(List<Integer> list, Node root) {
        if(root == null) {
            return;
        }
        List<Node> tmp = root.children;
        for(Node node : tmp) {
            search(list, node);
        }
        list.add(root.val);
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