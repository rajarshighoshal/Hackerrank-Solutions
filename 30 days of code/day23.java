static void levelOrder(Node root){
    Queue<Node> queue = new LinkedList<Node>();
    
    if(root != null){
        queue.add(root);
    }
    
    while(!queue.isEmpty()){
        
        Node tree = queue.remove();
        
        System.out.printf("%d ",tree.data);
        
        if(tree.left != null){
            queue.add(tree.left);
        }
        if(tree.right != null){
            queue.add(tree.right);
        }
    }
}