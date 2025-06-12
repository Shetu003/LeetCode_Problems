class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    //doubly LinkedList + HashMap
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int cap;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) { 
        this.cap = capacity;
        head.next = tail; //next of head points to the tail 
        tail.prev = head; //prev of tail points to the head
    }
    private void addNode(Node newNode){
        Node temp = head.next;  //adding a new node next to the head and before tail
        newNode.next = temp;
        newNode.prev = head;

        head.next = newNode;
        temp.prev = newNode;
    }
    private void deleteNode(Node delNode){
        Node prevv = delNode.prev; //linking the prev Node of delNode to prevv
        Node nextt = delNode.next; //linking the next Node of delNode to nextt

        prevv.next = nextt; //then the prev of the delnode points to the next of delnode 
        nextt.prev = prevv; //and the prev of next of the delnode points to the prev of the delnode 
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node resNode = map.get(key); //to get the key from the hashmap
            int ans = resNode.val;
            //if found then we have to remove it and make it points next to the head
            map.remove(key); 
            deleteNode(resNode);
            addNode(resNode);

            map.put(key, head.next); //add the accessed node into map again
            return ans;
        }
        return -1;
    }
    public void put(int key, int value) {
        if(map.containsKey(key)){ 
            Node curr = map.get(key); //if present update the key-value pairin which first we have to remove the key, then delete the node and then add it next to the head
            map.remove(key);
            deleteNode(curr);
        }
        if(map.size() == cap){ //if not present then remove the key of prev of tail and then delete the prev of tail Node 
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key,value)); //then add the new kay value pair(Node) next to the head
        map.put(key, head.next);
    }
}
