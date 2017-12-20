    public static  Node insert(Node head,int data) {
        Node new_node = new Node(data);
        
        if(head == null){
            head = new_node;
            return head;
        }
        
        Node trav = head;
        while(trav.next != null){
            trav = trav.next;
        }
        
        trav.next = new_node;
        return head;
    }