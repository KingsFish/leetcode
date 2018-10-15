class LRUCache {
    private HashMap<Integer, Node> map;
    private int capacity = 0;
    private int size = 0;
    private Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }
    
    public int get(int key) {
        Node tmp = map.get(key);
        if(tmp == null) {
            return -1;
        } else {
            addToHead(key);
            return tmp.val;
        }
    }
    
    public void put(int key, int value) {
        Node tmp = map.get(key);
        if(tmp == null) {
            tmp = new Node(key, value);
            map.put(key, tmp);
            size ++;
        } else {
			tmp.val = value;
		}
        addToHead(key);
        if(size > capacity) {
            trimToSize();
        }
    }
    
    private void addToHead(int key) {
        Node tmp = map.get(key);
        if(tmp == head) {
            return;
        }
        if (tmp == tail) {
			tail = tail.pre;
		}
        if(tmp.pre != null) {
            tmp.pre.next = tmp.next;
        }
        if(tmp.next != null) {
            tmp.next.pre = tmp.pre;
        }
        tmp.pre = null;
        tmp.next = head;
        if(head != null) {
        	head.pre = tmp;
        }
        head = tmp;
        if(tail == null) {
        	tail = tmp;
        }
    }
    
    private void trimToSize() {
        size --;
        map.remove(tail.key);
        tail = tail.pre;
        tail.next = null;
    }
    
    class Node{
        int val = 0;
        int key = 0;
        Node next;
        Node pre;
        public Node(int key, int val) {
            this.val = val;
            this.key = key;
            next = null;
            pre = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */